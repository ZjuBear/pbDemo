package com.example.javaSevenCode;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @Auther: qiaofu
 * @Date: 2018/5/13 15:58
 * @Description: test java 8
 */
public class applesEightDemo {


    private static List<Apple> appleList = setAppleList();


    public static void main(String[] args) {


        /*List<Integer> numbers = Arrays.asList(1,2,3);
        numbers.stream().map(n->n*n)
                        .forEach(n->{
                            System.out.println(n);
                        });*/

        List<Integer> number1 = Arrays.asList(1,2,3);
        List<Integer> number2 =   Arrays.asList(4,5);
        number1.stream()
                .map(num1 -> number2.stream()
                                    .map(num2-> new int[]{num1,num2})
                )
                .collect(toList());


       /* List<String> list = new ArrayList<String>() {
            {
                add("hello");
                add("World");
            }
        };
        String [] strings = {"hello","word"};
        list.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(l -> {
                    System.out.println(l);
                });*/

//        System.out.println(appleList);
//        System.out.println(filterApplesByWeight(appleList,10,20));
//       System.out.println(filterApples(appleList,(applesEightDemo a)->"red".equals("")));
        /*System.out.println(filterApples(appleList, (Apple a) -> "red".equals(a.getColor())));
        //List<Apple> heavyApple = appleList.stream().filter(Apple a) --> a.getWeight()>20);
        System.out.println();
        // System.out.println(filterApples(appleList,()-> "lambda".equals("1")));
        List<String> wordList = new ArrayList<String>();
        wordList.add("abcd");
        wordList.add("efgh");
        //String word="adc";
        List<String> output = wordList.stream().
                map(String::toUpperCase).
                collect(toList());
        System.out.println(output);*/

        /*Set<String> set = new HashSet<String>();
        for (int i = 0; i < 20; i++)
            set.add("a" + i);
        set.stream().forEach(
                a -> {
                    System.out.println(a);
                });
        System.out.println("---------------");
        set.stream().limit(10).forEach(
                a -> {
                    System.out.println(a);
                });*/
    }

    public static boolean isRedApple(Apple apple) {
        return "red".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple, double low, double hight) {
        return apple.getWeight() >= low && apple.getWeight() <= hight;
    }

    static List<Apple> filterApples(List<Apple> appleList, Predicate<Apple> P) {

        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (P.test(apple))
                result.add(apple);
        }
        return result;
    }


    private static List<Apple> setAppleList() {
        List<Apple> list = new ArrayList<>();
        Apple appleGreen = new Apple();
        appleGreen.setColor("green");
        appleGreen.setWeight(30);
        list.add(appleGreen);
        Apple apple = new Apple();
        apple.setColor("red");
        apple.setWeight(80);
        list.add(apple);

        return list;
    }

}
