package com.company;

import java.io.IOException;

public class SelectionSort {
public static volatile int arr[] = new int[10000];
//public static boolean flag;

public static void ArrIn() throws IOException {
/*    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(reader.readLine());
    }*/
    for(int i = 0; i < 10000; i++){
        arr[i] = (int)(Math.random()*10000); //случайные числа
        //arr[i] = i;  //последовательность
    }


}

public static int[] Sort() {
    for(int i = 0; i < arr.length - 1; i++) {
        int min = arr[i];
        int index = i;
        for(int j = i; j < arr.length; j++) { //поиск минимума
            if(arr[j] < min) {
                min = arr[j];
                index = j;
            }
        }
        int buff = arr[i];   //обмен значениями
        arr[i] = arr[index];
        arr[index] = buff;
    }
    return arr;
}

public static void print(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

}
