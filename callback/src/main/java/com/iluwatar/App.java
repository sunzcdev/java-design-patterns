package com.iluwatar;

/**
 * Callback pattern is more native for functional languages where function is treated as first-class citizen.
 * Prior to Java8 can be simulated using simple (alike command) interfaces.
 * 回调设计模式是一种过程式程序语言的设计。
 * 任务执行完成之后，
 */
public class App {

    public static void main(String[] args) {
        Task task = new SimpleTask();
        task.executeWith(new Callback() {
            @Override
            public void call() {
                System.out.println("I'm done now.");
            }
        });
    }
}
