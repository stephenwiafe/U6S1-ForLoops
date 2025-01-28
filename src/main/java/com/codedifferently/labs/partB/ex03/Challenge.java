package com.codedifferently.labs.partB.ex03;

public class Challenge {
    public static String challenge(){
        String response = "";
        /**
         * Your code goes here
         */
        String[] names = {"Kaleb", "Tariq", "Gio", "Sam", "Steph", "Michael"};

        for (int i = 0; i < names.length; i++) {
            response += names[i] + "\n";
        }
        return response;
    }

    public static void main(String[] args) {

        String outputFromChallenge = challenge();
        System.out.println(outputFromChallenge);
    }
}
