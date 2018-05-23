package com.example.TraderDemoForStream;

/**
 * @Auther: qiaofu
 * @Date: 2018/5/21 18:09
 * @Description:
 */
public class Trader {
    private final String name;
    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getCity() {

        return city;
    }

    public String getName() {

        return name;
    }

    public String toString(){
        return "Trader:" + this.name + " in " + this.city;
    }
}
