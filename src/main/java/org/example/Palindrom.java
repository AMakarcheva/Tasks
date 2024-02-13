package org.example;

public class Palindrom {
    protected static void palindrom(String origin){
        origin = origin.toLowerCase().replaceAll(" ", "");
        String result ="";

        char[] arrChar = origin.toCharArray();

        for (int i=arrChar.length-1; i>=0; i--){
            result = result + arrChar[i];
        }
        if (origin.equals(result)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
