package com.codedifferently.labs.partB.ex02;

public class FixThisLoop {

    public static String hello(){
        String response = "";
        /*
         * Your code goes here
         */
        for (int i = 0; i < 5; i++) {
            response += "Hello\n";
        }

        return response;

    }
    public static void main(String[] args) {

        String outputFromHello = hello();
        System.out.println(outputFromHello);
    }
}
