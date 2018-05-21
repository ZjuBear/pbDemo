package com.example.javaSevenCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: qiaofu
 * @Date: 2018/5/13 21:44
 * @Description:
 */
public class readFileSevenDemo {
    public static void main(String[] args) throws IOException {
        System.out.println(processFile());
    }
    public static String processFile() throws IOException{
        try(BufferedReader br =
        new BufferedReader(new FileReader("pom.xml"))){
            return br.readLine();
        }
    }
}
