package com.xinghuan.cocoon.concurrent;

/**
 * @author shenchen
 * @version 1.0
 * @date 2021/7/17 6:43 下午
 */
public class VolatileDemo {

    public static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (!stop) {
                i++;
                System.out.println(i);
            }
        });
        thread.start();
//        Thread.sleep(1000);
        System.out.println("begin start thread");
        stop = true;
    }
}
