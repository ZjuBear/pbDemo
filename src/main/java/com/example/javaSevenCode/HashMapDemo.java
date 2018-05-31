package com.example.javaSevenCode;

import java.util.HashMap;
import java.util.Map;
import com.google.common.collect.Maps;
/**
 * @Auther: qiaofu
 * @Date: 2018/5/31 14:20
 * @Description:
 */
public class HashMapDemo {
    private static Map<Integer, Map<Long, String >> map = new HashMap<>();

    public static void main(String[] args) {
        Map<Long, String > Maps1 = new HashMap();
        Maps1.put(1l,"a");
        Maps1.put(2l,"a");
        Maps1.put(3l,"a");
        Map<Long, String > Maps2 = new HashMap();
        Maps2.put(1l,"a");
        Maps2.put(2l,"a");
        Maps2.put(3l,"a");
        map.put(1,Maps1);
        map.put(3,Maps2);

        Map<Long, String > Map4 = map.get(3);
        System.out.println(map);

        Map4.put(1l,"b");

        System.out.println(map);

        System.out.println("Map ,key:"+Map4.getClass().toString()+", or Map:"+Maps2.getClass().toString());

    }
}
