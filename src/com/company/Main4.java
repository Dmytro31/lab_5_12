package com.company;

public class Main4 {
    public static  void main(String[] args){
        int par = 0;
        int array[] = new int [15];
        for(int s = 0; s < 15; s++) {
            array[s] = (int) Math.round(Math.random() * 10);
            System.out.println(array[s]);

            if(array[s] % 2 == 0){
               par++;
            }
        }
        System.out.println("Parni:  " + par);
    }
}
