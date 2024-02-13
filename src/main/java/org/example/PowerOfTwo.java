package org.example;

class PowerOfTwo {
    protected static void two(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (Integer.bitCount(arr[i]) == 1) {
                System.out.println("For " + arr[i] + " true");
            } else {
                System.out.println("For " + arr[i] + " false");
            }

        }
    }
}