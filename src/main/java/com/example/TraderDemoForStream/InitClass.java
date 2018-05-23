package com.example.TraderDemoForStream;

import org.springframework.security.core.parameters.P;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;

/**
 * @Auther: qiaofu
 * @Date: 2018/5/21 18:20
 * @Description:
 */
public class InitClass {
    private static Trader raoul = new Trader("Raoul", "Cambridge");
    private static Trader mario = new Trader("mario", "Milan");
    private static Trader alan = new Trader("Alan", "Cambridge");
    private static Trader brian = new Trader("Brian", "Cambridge");


    public static void main(String[] args) {
        List<Transaction> transactionList = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(alan, 2012, 1000),
                new Transaction(raoul, 2011, 188),
                new Transaction(mario, 2010, 380),
                new Transaction(alan, 2014, 1020),
                new Transaction(raoul, 2013, 180)
        );
        //按照2011交易额逆序排序
        transactionList.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(
                        t -> {
                            System.out.println(t.toString());
                        }
                );

        System.out.println("交易员呆过的城市");

        transactionList.stream()
                .map(t->t.getTrader().getCity())
                .distinct()
                .forEach(
                        t->{
                            System.out.println(t);
                        }
                );

        System.out.println("查找来自剑桥的交易员，并按照名字排序");

        transactionList.stream()
                .filter(t->t.getTrader().getCity().equals("Cambridge"))
                .map(t->t.getTrader())
                .sorted(comparing(Trader::getName))
                .distinct()
                .forEach(
                        t-> {
                            System.out.println(t);
                        }
                );


        System.out.println("返回交易员姓名的字符串，按字母顺序排序");

        transactionList.stream()
                .map(t->t.getTrader().getName())
                .distinct()
                .sorted()
                .forEach(t->{
                    System.out.println(t);
                });
                //.reduce("",(n1,n2)->n1+n2);
        //System.out.println(str);

        String str = transactionList.stream()
                .map(t->t.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(n1,n2)->n1+n2);
        System.out.println(str);

        String s=transactionList.stream()
                .map(t->t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(joining());

        System.out.println(s);

        System.out.println("打印生活在剑桥的交易员的所有交易额");

        transactionList.stream()
                .filter(t->t.getTrader().getCity().equals("Milan"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

    }

}
