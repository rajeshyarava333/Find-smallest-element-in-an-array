package com.company;

public class Main {

    public static void main(String[] args) {
        int [] a ={9,7,5,6,4,3,2,1};
        int min = a[0];
        for(int b:a){
            if(b<min)
                min=b;
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}
