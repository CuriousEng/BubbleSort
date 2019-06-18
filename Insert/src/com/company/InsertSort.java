package com.company;

import java.io.IOException;

public class InsertSort {
public static int arr[] = new int[10];
//public static boolean flag;

public static void ArrIn() throws IOException {
/*    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(reader.readLine());
    }*/
    for(int i = 0; i < 10; i++){
        arr[i] = (int)(Math.random()*100); //случайные числа
        //arr[i] = i;  //последовательность
    }


}

public static int[] Sort() {
    for (int i = 0; i < arr.length - 1; i++){
        for (int j = i + 1; j > 0; j--) {
            int min = arr[j - 1];
            if (arr[j] < min) {
                int buff = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = buff;
            }

        }
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
