package com.javacore.chuong2;

public class ExplicitCasting {

  public static void main(String[] args) {
    double d = 100.04;
    long l = (long) d; // chuyển từ kiểu dữ liệu double về kiểu long
    int i = (int) l; // chuyển từ kiểu dữ liệu long về kiểu int
    System.out.println("Giá trị biến d = " + d);
    System.out.println("Giá trị biến l = " + l);
    System.out.println("Giá trị biến i = " + i);
  }

}
