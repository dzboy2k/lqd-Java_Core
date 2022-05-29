package com.javacore.chuong4;

public class DuyetMang {
  private static final int SIZE = 5;

  public static void main(String[] args) {
    int i;
    int[] ages = new int[SIZE]; // khai báo mảng

    // gán giá trị vào mảng
    for (i = 0; i < SIZE; i++) {
      ages[i] = 5 + i;
    }
    // Duyệt các phần tử mảng dùng vòng lặp for
    for (i = 0; i < SIZE; i++) {
      System.out.print(ages[i] + " ");
    }
  }
}
