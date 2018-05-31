package com.example.javaSevenCode;

import io.netty.util.internal.chmv8.ConcurrentHashMapV8;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Auther: qiaofu
 * @Date: 2018/5/31 14:20
 * @Description:
 */
public class ConcurrentHashMapV8Demo {
    private static volatile ConcurrentMap<Integer, ConcurrentMap<Long, String >> appUserStatusMap = new ConcurrentHashMapV8<>();

    public static void main(String[] args) {
        ConcurrentMap<Long, String > concurrentMaps = new ConcurrentHashMap();
        concurrentMaps.putIfAbsent(1l,"a");
        concurrentMaps.putIfAbsent(2l,"b");
        concurrentMaps.putIfAbsent(3l,"c");
        ConcurrentMap<Long, String > concurrentMaps1 = new ConcurrentHashMap();
        concurrentMaps1.putIfAbsent(1l,"a");
        concurrentMaps1.putIfAbsent(2l,"b");
        appUserStatusMap.putIfAbsent(1,concurrentMaps);
        appUserStatusMap.putIfAbsent(2,concurrentMaps);
        appUserStatusMap.put(3,null);
        appUserStatusMap.putIfAbsent(4,null);
        appUserStatusMap.putIfAbsent(5,null);

        ConcurrentMap<Long, String > concurrentMap = appUserStatusMap.get(1);
        System.out.println(concurrentMap);

        System.out.println(appUserStatusMap);
        concurrentMap.put(4l,"d");
        System.out.println(appUserStatusMap);

    }

}
