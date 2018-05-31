package com.example.javaSevenCode;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.summarizingInt;

/**
 * @Auther: qiaofu
 * @Date: 2018/5/28 20:27
 * @Description:
 */
public class CollectionDemo {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                new String("abcc"),
                new String("abc"),
                new String("abc")
        );

        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .collect(summarizingInt(String::length));
        System.out.println(intSummaryStatistics);

        String s = strings.stream().collect(joining("，"));
        System.out.println(s);

        Map<Integer, Map<Integer, List<String>>> map = strings.stream()
                .collect(groupingBy(String::length,groupingBy(String::hashCode)));
        System.out.println(map);

    }


}
