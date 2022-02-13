package com.radin.std;

public class DataRef {
    public static void main(String[] args) {
        System.out.println("Data Reference or String");
        String user = "guest";
        char[] idChar = {'a','c','x','2','z','7'}; // array id
        String idString = new String(idChar); // array to string

        Data data = new Data(idString);

        //length
        int userLength = user.length();

        // put a spesific char from string
        char midChar = user.charAt(userLength/2);

        System.out.println(user + ", Word Sum : "+ userLength);
        System.out.println("Your name middle char is : " + midChar);

        
    }

}
