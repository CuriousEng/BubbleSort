package com.company;

import java.io.IOException;

public class ShakeSort {
    public static int[] arr = new int[10000];

    public ShakeSort() {
    }

    public static void ArrIn() throws IOException {
        for(int i = 0; i < 10000; i++) {
            arr[i] = (int)(Math.random()*10000);
            //arr[i] = i;
        }

    }

    public static int[] Sort() {
        int lb = 0;
        int ub = arr.length - 1;
        int k = 0;

        do {
            boolean flag = false;

            int i;
            int buff;
            for(i = lb; i < ub; k = i++) {
                if (arr[i] > arr[i + 1]) {
                    buff = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = buff;
                    flag = true;
                }
            }

            if (!flag) {
                return arr;
            }

            ub = k;
            flag = false;

            for(i = k; i > lb; k = i--) {
                if (arr[i] < arr[i - 1]) {
                    buff = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = buff;
                    flag = true;
                }
            }

            if (!flag) {
                return arr;
            }

            lb = k;
        } while(k < ub);

        return arr;
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}