package org.example;

public class Palindrom {
    protected static void palindrom(String origin) {

        origin = origin.replaceAll(" ", "");

        StringBuilder revert = new StringBuilder(origin).reverse();
        String result = revert.toString().replaceAll(" ", "");

        if (origin.equalsIgnoreCase(result)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
