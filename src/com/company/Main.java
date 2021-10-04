package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int n = 7;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < n && array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("The sum of positive numbers up to index n = " + sum);
    }
}

