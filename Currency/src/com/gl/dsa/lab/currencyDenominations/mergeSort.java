package com.gl.dsa.lab.currencyDenominations;

public class mergeSort {

    void merge(int denominations[],int left, int middle,int right){
        int n1 = middle-left+1;
        int n2= right-middle;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for(int i=0;i<n1;++i)
            leftArr[i] = denominations[left + i];
        for(int j=0;j<n2;++j)
            rightArr[j] = denominations[middle+1+j];

        int i=0,j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(leftArr[i] <= rightArr[j]){
                denominations[i] =leftArr[i];
                i++;
            }
            else{
                denominations[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            denominations[k] = leftArr[i];
            i++;
            k++;
        }

        while(j<n2){
            denominations[k] = rightArr[j];
            j++;
            k++;
        }
    }

    void sort(int denominations[],int left,int right){
        if(left<right){
            int middle = (left+right)/2;
            sort(denominations,left,middle);
            sort(denominations,middle+1,right);
            merge(denominations,left,middle,right);
        }
    }
}
