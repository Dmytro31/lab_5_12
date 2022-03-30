package com.company;

public class Main3 {
    public static  void main(String[] args){
        int array[] = new int [10];
        for(int i = 0; i < 10; i++){
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.println(array[i] + "");
        }
        System.out.println(" ");
        int array_1[] = new int [10];
        for(int i = 0; i < 10; i++) {
            array_1[i] = (int) Math.round(Math.random() * 10);
            System.out.println(array_1[i] + "");
        }
        System.out.println(" ");
        int array_2[] = new int [10];
        for (int i = 0; i < 10; i++){
            array_2[i] = array_1[i] + array[i];
            System.out.println(array_2[i]);
        }
    }
}
