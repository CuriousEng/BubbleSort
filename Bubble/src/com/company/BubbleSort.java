package com.company;

import java.io.IOException;

public class BubbleSort {
    public static volatile int[] arr = new int[10000];

    public BubbleSort() {
    }

    public static void ArrIn() throws IOException {
        for(int i = 0; i < 10000; i++) {
            arr[i] = (int)(Math.random()*10000);
            //arr[i] = i;
        }
    }

    public static int[] Sort() {
        for(int j = 0; j < arr.length - 1; ++j) {
            //boolean flag = false;

            for(int i = 0; i < arr.length - 1 - j; ++i) {
                if (arr[i] > arr[i + 1]) {
                    int buff = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = buff;
                    //flag = true;
                }
            }

/*            if (!flag) {
                return arr;
            }*/
        }

        return arr;
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}