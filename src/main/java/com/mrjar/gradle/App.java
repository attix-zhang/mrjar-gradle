package com.mrjar.gradle;

public class App {
    public static void main(String... args) {
        System.out.println("I'm running under:" + new JdkSpecific().getJdkVersion());
    }
}
