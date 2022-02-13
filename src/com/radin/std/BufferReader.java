package com.radin.std;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) {
        // inisialization call the function and make with var
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferReader = new BufferedReader(streamReader);
       
        System.out.println("Program perkalian sangat sederhana");
        // set def variable input
        int value = 0;
        int anotherValue = 0;
        // input process
        try {
            System.out.println("Masukan Angka pertama : ");
            value = Integer.parseInt(bufferReader.readLine());
            System.out.println("Masukan Angka kedua : ");
            anotherValue = Integer.parseInt(bufferReader.readLine());
        } catch (IOException e){
            e.printStackTrace();
        }
        // output process
        int result = value * anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}
