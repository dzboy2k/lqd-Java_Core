package com.javacore.chuong3;

public class StringReferenceComparison {

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");
    System.out.println(s1 == s2);//true (vì cả 2 cùng tham chiếu instance giống nhau)
    System.out.println(s1 == s3);//false(vì s3 tham chiếu instance mà không ở trong Pool)
  }
}
