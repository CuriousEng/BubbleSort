package com.company;

import java.io.IOException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        BubbleSort.ArrIn();
        long average = 0;
        for(int i = 0; i < 1000; i++) {
            long startTime = System.nanoTime();
            //ShakeSort.print(BubbleSort.Sort());
            BubbleSort.Sort();
            long stopTime = System.nanoTime();
            //System.out.print((stopTime - startTime) + " ");
            average += stopTime -startTime;
        }
        System.out.println();
        System.out.println(average / 1000);
    }
}