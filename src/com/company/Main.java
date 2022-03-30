package com.company;

public class Main {
    public static void main(String[] args) {
        int array[] = new int[50];
	    for (int i = 1, s = 0; i <= 99; i = i + 2, s++){
            System.out.println(array[s] = i);
        }

    }
}
