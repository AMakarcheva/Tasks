package org.example;

public class Coordinates {


    protected static void coordinates(int[][] arr, int numberToSerch) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i][arr[i].length-1] >= numberToSerch && arr[i][0] <= numberToSerch) {

                for (int j = 0; j < arr[i].length; j++) {

                    if (arr[i][j] == numberToSerch) {
                        System.out.println(i + "," + j);
                    }
                }
            } break;
        }
    }
}
