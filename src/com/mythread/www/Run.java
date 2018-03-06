package com.mythread.www;

/**
 * 线程是一个子任务，CPU以不确定的方式或者以随机的时间来调用线程中的run方法
 * 所以会出现先打印“运行结束”后输出“MyThread”这样的结果。
 */
public class Run {

    public static void main(String[] args){
        Thread thread = new MyThread();
        thread.start();
        System.out.println("运行结束");

    }
}
