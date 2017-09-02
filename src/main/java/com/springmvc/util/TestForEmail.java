package com.springmvc.util;

/**
 * Created by hulimin on 2017/9/1.
 */
public class TestForEmail {
    public int testForEmail(String email) {
        int result = 0;
        int a = email.indexOf("@");
        int b = email.indexOf(".com");
        if (a > 0 && b > 0) {
            result  = 1;

        }
        return result;
    }
}
