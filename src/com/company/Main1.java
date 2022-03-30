package com.company;

public class Main1 {
    public static void main(String[] args) {
        int array[] = new int[20];
        for(int f = 0; f < 20; f++){
            array[f] = (int) Math.round(Math.random() * 9);
            System.out.println(array[f]);
        }
        System.out.println("no");
        int s = 0;
        while(s < array.length){
            s++;
            if(0 != s % 2){
            array[s] = 0;
            }
            System.out.println(array[s]);
        }
    }
}
