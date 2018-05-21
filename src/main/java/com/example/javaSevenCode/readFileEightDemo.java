package com.example.javaSevenCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: qiaofu
 * @Date: 2018/5/13 21:48
 * @Description:函数式编程读文件
 */
public class readFileEightDemo {
    public static void main(String[] args) throws IOException {
        String result = processFile((BufferedReader br)->br.readLine()+br.readLine(),"pom.xml");
        System.out.println(result);
    }

    @FunctionalInterface
    public interface BufferedReaderProcessor{
        String process(BufferedReader b) throws IOException;
    }
    private static String processFile(BufferedReaderProcessor p, String fileName) throws IOException{
        try(BufferedReader br =
        new BufferedReader(new FileReader(fileName))){
            return p.process(br);
        }
    }
}
