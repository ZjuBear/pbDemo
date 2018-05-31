package com.example.javaSevenCode;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Auther: qiaofu
 * @Date: 2018/5/31 14:20
 * @Description:
 */
public class ConcurrentHashMapDemo {
    private static ConcurrentMap<Integer, ConcurrentMap<Long, String >> appUserStatusMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        ConcurrentMap<Long, String > concurrentMaps = new ConcurrentHashMap();
        concurrentMaps.putIfAbsent(1l,"a");
        concurrentMaps.putIfAbsent(2l,"b");
        concurrentMaps.putIfAbsent(3l,"c");
        System.out.println(concurrentMaps);

        appUserStatusMap.put(1,concurrentMaps);
        System.out.println(appUserStatusMap);

        concurrentMaps.put(1l,"b");
        System.out.println(concurrentMaps);

        appUserStatusMap.put(2,concurrentMaps);

        ConcurrentMap<Long, String > concurrentMap = appUserStatusMap.get(2);
        System.out.println(concurrentMap);

        System.out.println(appUserStatusMap);
        concurrentMap.put(4l,"d");
        System.out.println(appUserStatusMap);

    }

}
