package com.javacore.chuong5;

public class ValueTypeTest {
  static void addOneTo(int num) {
    num = num + 1;
  }

  public static void main(String[] args) {
    int x = 5;
    addOneTo(x);
    System.out.println(x);
  }
}
