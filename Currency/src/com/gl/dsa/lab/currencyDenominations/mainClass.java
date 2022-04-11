package com.gl.dsa.lab.currencyDenominations;

import java.util.Scanner;

public class mainClass {

    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of denominations: ");
        int number = sc.nextInt();
        int denominations[] = new int[number];
        System.out.println("Please enter the denominations: ");
        for(int i=0;i<number;i++)
            denominations[i]=sc.nextInt();
        System.out.println("Enter the amount you want to pay: ");
        int amount = sc.nextInt();
        mergeSort mergeSort = new mergeSort();
        mergeSort.sort(denominations,0,denominations.length-1);
        NotesCount notesCount = new NotesCount();
        notesCount.notesCountImplementation(denominations,amount);
    }
}
