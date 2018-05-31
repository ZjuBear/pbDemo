package com.example.javaSevenCode;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: qiaofu
 * @Date: 2018/5/13 15:23
 * @Description:
 */
public class ListTest {
    public static void main(String[] args) {
        List<String>  stringList = Arrays.asList(
                new String("a"),
                new String("b"),
                new String("c"),
                new String("d")
        );
        System.out.println(stringList);
        //stringList.add("e");
        changeList(stringList);
        System.out.println(stringList);


    }

    private static void changeList(List<String> list){
        list.add("e");
        list.set(1,"e");
    }
}
