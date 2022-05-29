package com.javacore.chuong3;

public class StringLowerUpperExample {
  public static void main(String[] args) {
    String s1 = "HELLO java";

    //chuyển thành chữ thường
    String s1lower = s1.toLowerCase();
    System.out.println(s1lower);
    //kết quả :hello java

    //chuyển thành chữ hoa
    String s1Upper = s1.toUpperCase();
    System.out.println(s1Upper);
    //kết quả : HELLO JAVA
  }
}
