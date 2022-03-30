package com.company;

public class Main2 {
    public static void main(String[] args){
        double a = 0, s = 0, d = 0;
        int array[] = new int [5];
        for(int i = 0; i < 5; i++){
            array[i] = (int) Math.round(Math.random() * 5);
            a = a + array[i];
            System.out.println(array[i] + "");
        }
        System.out.println("");
        int array_1[] = new int [5];
        for(int v = 0; v < 5; v++) {
            array_1[v] = (int) Math.round(Math.random() * 5);
            s = s + array_1[v];
            System.out.println(array_1[v] + "");
        }
        System.out.println("");
        int array_2[] = new int [5];
        for(int x = 0; x < 5; x++) {
            array_2[x] = (int) Math.round(Math.random() * 5);
            d = d + array_2[x];
            System.out.println(array_2[x] + "");
        }
        System.out.println("1 мас " + a/5);
        System.out.println("2 мас " + s/5);
        System.out.println("3 мас " + d/5);
        double f = Math.max(a/5, s/5);
        System.out.println(Math.max(f, d/5 ));

    }
}
