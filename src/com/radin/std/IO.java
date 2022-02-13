package com.radin.std;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        // init scanner 
        Scanner scanner = new Scanner(System.in);
        // input process
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.println("Masukan Angka pertama : ");
        int value = scanner.nextInt();
       
        System.out.println("Masukan Angka kedua : ");
        int anotherValue = scanner.nextInt();
        // output process
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);

    }
}
