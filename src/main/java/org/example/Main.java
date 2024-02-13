package org.example;


import java.util.Arrays;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        // Написать код, который принимает число и выдает true, если число является степенью двойки и false - если нет
        int[] arr = {2, 256, 300, 500, 1024};
        PowerOfTwo.two(arr);

        // Даны 4 числа, надо найти наибольшее. if использовать нельзя, код должен быть не больше 10 строк
        int[] arr2 = {2, 4, 5, 3};
        Sorting.sorting(arr2);

        //Проверить, является ли фраза палиндромом
        String s = "А роза упала на лапу Азора";
        Palindrom.palindrom(s);


    }
}
