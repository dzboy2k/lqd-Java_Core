package com.javacore.exception;

public class ExceptionTest {

  public static void main(String[] args) {


    //NullPointerException
    String strObject = null;
    //So sánh với hằng số
    if (strObject.equals("JAVA")) {
      System.out.println("Hello Java");
    }

    //java.lang.ArrayIndexOutOfBoundsException
    int[] aryInt = new int[3];
    aryInt[0] = 2;
    aryInt[1] = 7;
    aryInt[2] = 9;
    //truy xuat phan tu mang voi index = 5
    System.out.println(aryInt[5]);


  }

}
