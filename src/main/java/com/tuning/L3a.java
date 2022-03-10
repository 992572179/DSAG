package com.tuning;

/**
 * @author wangzy
 * @date 2022/3/10
 **/
public class L3a {

    public static void main(String[] args) {
        int a = 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(a & ~a));
    }
}
