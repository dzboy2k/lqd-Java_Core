package com.javacore.chuong3;

public class SubstringExample {
  public static void main(String[] args) {
    String s1 = "hellojava";

    // Cắt từ vị trí index = 3
    System.out.println(s1.substring(3));// "lojava"

    // Cắt từ vị trí index = 3 tới index = 7
    System.out.println(s1.substring(3, 7));// "loja"

  }
}
