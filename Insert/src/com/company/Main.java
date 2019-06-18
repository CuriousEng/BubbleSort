package com.company;

import java.io.IOException;

public class Main {

public static void main(String[] args) throws IOException {
    InsertSort.ArrIn();
    long start = System.nanoTime();
    InsertSort.print(InsertSort.Sort());
    long stop = System.nanoTime();
    System.out.println(stop - start);
}
}
