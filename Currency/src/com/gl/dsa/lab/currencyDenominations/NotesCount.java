package com.gl.dsa.lab.currencyDenominations;

public class NotesCount {

    public void notesCountImplementation(int denominations[],int amount){
        int noteCounter[] = new int[denominations.length];

        for(int i=0;i<denominations.length;i++){
            if(amount>=denominations[i]){
                noteCounter[i] = amount/denominations[i];
                amount = amount- noteCounter[i] * denominations[i];
            }
        }
        if(amount>0){
            System.out.println("Exact amount cannot be given with highest denomination!");
    }else{
            System.out.println("Your payment approach in order to give minimum number of notes will be: ");
            for(int i=0;i<denominations.length;i++){
                if(noteCounter[i] != 0){
                    System.out.println(denominations[i] + ":" +noteCounter[i]);
                }
            }
        }
        System.out.println("Notes of denomination 0 is invalid!");

    }

}
