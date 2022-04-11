package com.gl.labTest.PayMoney;

import java.util.Scanner;

public class mainClass {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of transaction array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;

        System.out.println("Enter the values of transaction array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Enter the total number of targets that need to be achieved: ");
        int target = sc.nextInt();

        int targetValue[] = new int[target];

        while (target-- != 0) {
            boolean flag = false;
            for (int i = 0; i <= target; ++i) {
                System.out.println("Enter the value of " + (i + 1) + " target: ");
                targetValue[i] = sc.nextInt();
                sum = sum + arr[i];
                if (sum >= targetValue[i]) {
                    System.out.println("Target achieved after " + (i) + " transactions");
                    flag = true;
                    target--;
                }
            }
        }
    }
}
