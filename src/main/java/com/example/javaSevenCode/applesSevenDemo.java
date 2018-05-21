package com.example.javaSevenCode;

import java.lang.reflect.AnnotatedParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: qiaofu
 * @Date: 2018/5/13 15:22
 * @Description:test java 7
 */
public class applesSevenDemo {

    private static List<Apple> appleList = setAppleList();


    public static void main(String[] args) {
        System.out.println(appleList);
        System.out.println(filterApplesByWeight(appleList,10,20));
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> appleList = new ArrayList<>();
        for (Apple apple : inventory) {
            System.out.println(apple.getColor());
            if ("red".equals(apple.getColor()))
                appleList.add(apple);
        }
        return appleList;
    }
    public static List<Apple> filterApplesByWeight(List<Apple> inventory,double low,double hight) {
        List<Apple> appleList = new ArrayList<>();
        for (Apple apple : inventory) {
            System.out.println(apple.getWeight());
            if(apple.getWeight()>=low && apple.getWeight()<=hight)
                appleList.add(apple);

        }
        return appleList;
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
