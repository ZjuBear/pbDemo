package com.example.javaSevenCode;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

/**
 * @Auther: qiaofu
 * @Date: 2018/5/29 20:44
 * @Description:
 */
public class ForkJoinSumCalculator extends RecursiveTask<Long> {
    private static final long THRESHOLD = 100000;
    private final long[] numbers;
    private final int start;
    private final int end;

    public ForkJoinSumCalculator(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    private ForkJoinSumCalculator(long[] numbers, int start, int end) {
        this.end = end;
        this.numbers = numbers;
        this.start = start;
    }

    @Override
    protected Long compute() {
        int length = end - start;
        if (length <= THRESHOLD)
            return computeSequentially();
        ForkJoinSumCalculator leftTask =
                new ForkJoinSumCalculator(numbers, start, start + length / 2);
        leftTask.fork();
        ForkJoinSumCalculator rightTask =
                new ForkJoinSumCalculator(numbers, start + length / 2, end);
        Long leftResult = leftTask.join();
        Long rightResult = rightTask.join();
        return leftResult + rightResult;
    }

    private Long computeSequentially() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        forkJoinSum(100);
        System.out.println(System.currentTimeMillis()-start);
    }

    public static long forkJoinSum(long n){
      long[] numbers = LongStream.rangeClosed(1,n).toArray();
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        return new ForkJoinPool().invoke(task);
    }
}
