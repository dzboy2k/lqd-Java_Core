package com.javacore.chuong4;

public class ArrayForeachExample {

  public static void main(String[] args) {

    // Khai báo một mảng các String.
    String[] fruits = new String[] { "Apple", "Apricot", "Banana" };

    // Sử dụng vòng lặp for-each để duyệt qua các phần tử của mảng.
    for (String s  : fruits) {

      System.out.print(s + ",");
    }
  }
}
