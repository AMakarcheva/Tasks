package org.example;


import java.util.Arrays;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
// Написать код, который принимает число и выдает true, если число является степенью двойки и false - если нет
//        int[] arr = {2, 256, 300, 500, 1024};
//        PowerOfTwo.two(arr);

// Даны 4 числа, надо найти наибольшее. if использовать нельзя, код должен быть не больше 10 строк
        int[] arr2 = {2, 4, 5, 3};
        Sorting.sorting(arr2);

//Проверить, является ли фраза палиндромом
        String s = "А роза упала на лапу Азора";
        Palindrom.palindrom(s);

// Вывести 10_000 раз какую-либо строку без использования циклов
        ThousandsStrings.tenThousant("a");

// Дано число, надо найти его координаты
        int[][] arr = {{1, 4, 5, 9, 17}, {17, 24, 25, 31}, {32, 35, 40, 55}, {57, 59, 63, 88}};
        int i = 40;
        Coordinates.coordinates(arr, i);
    }
}
