package com.tuning;

/**
 * @author wangzy
 * @date 2022/3/9
 * 统计素数个数
 **/
public class L2PrimeCount {

    /**
     * 输入给定的n，返回2-n之间素数个数
     *
     * @param n 范围[2-n]
     * @return 素数总个数
     */
    private static int getCountByViolenceCalc(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(getCountByViolenceCalc(20_0000));
        long end = System.currentTimeMillis();
        System.out.printf("time->%d", end - start);

    }
}
//100_0000  78498
//20_0000   17984
//10_0000   9592
//10000     1229

