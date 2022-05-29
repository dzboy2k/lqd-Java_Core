package com.javacore.chuong3;

public class StringComparisonTo {

  public static void main(String[] args) {

    // Tạo các đối tượng
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = "Java";

    // so sánh
    System.out.println(s1.compareTo(s2)); // 0 : bằng nhau
    System.out.println(s1.compareTo(s3)); // -2 : s1 < s3
    System.out.println(s3.compareTo(s1)); // 2 : s3 > s1
  }
}
