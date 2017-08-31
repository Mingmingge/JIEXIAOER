package com.springmvc.util;

import java.util.Random;

/**
 * Created by hulimin on 2017/8/30.
 */
public class ProductRandom {
    String str = "";
    Random random = new Random();
    int i = 0;
    public String toRandom() {
        for (i = 0;i < 6;i ++) {
            int a = random.nextInt(10);
            str = str + Integer.toString(a);
        }
       return str;
    }
}
