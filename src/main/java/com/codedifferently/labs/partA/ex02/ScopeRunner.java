package com.codedifferently.labs.partA.ex02;

public class ScopeRunner {

    public static String scope(){
        String response = "";

        for (int j = 64; j >0; j=j/2 ){
            response += j +" ";
        }

        response += "\n";

        for(int j = 0; j<=5; j++){
            response +=j +" ";
        }
        response += "\n";

        for(int j = 5; j>=0; j--){
            response += j +" ";
        }

        response += "\n";
        for(int k = 2; k<=64; k=k*2){
            response +=k +" ";
        }
        response += "\n";

        return response;

    }
    public static void main(String[] args) {
        String scopeRunner = scope();
        System.out.print(scopeRunner);

    }}
