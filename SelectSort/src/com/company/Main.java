package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	SelectionSort.ArrIn();
		long average = 0;
	for (int i = 0; i < 1000; i++) {
		long start = System.nanoTime();
		SelectionSort.Sort();
		long stop = System.nanoTime();
		System.out.print((stop - start) + " ");
		average += stop - start;
	}
	System.out.println();
	System.out.println(average / 100);
    }
}
