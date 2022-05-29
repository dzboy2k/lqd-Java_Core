package com.javacore.toantu;

public class BitOperators {

  public static void main(String[] args) {

    // Dùng Integer.toBinaryString để convert int sang chuỗi binary string
    int a = 60; /* 60 = 0011 1100 */
    int b = 13; /* 13 = 0000 1101 */
    int c = 0;

    // Dùng Integer.parseInt("00001100",2) để convert từ binary string sang kiểu int
    c = a & b; /* 12 = 0000 1100 */
    System.out.println("a & b = " + c );

    // Dùng Integer.parseInt("00111101",2) để convert từ binary string sang kiểu int
    c = a | b; /* 61 = 0011 1101 */
    System.out.println("a | b = " + c );

    System.out.println("c= " +Integer.parseInt("00111101",2));
  }
}
