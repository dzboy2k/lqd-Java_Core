package com.javacore.chuong3;

public class IndexOfExample {
  public static void main(String[] args) {

    String s1 = "Hello java";

    //Tìm vị trí của ký tự
    int index1 = s1.indexOf('o');
    System.out.println("index1 = " + index1);//Kết quả : index1 = 4

    //Tìm vị trí index của chuỗi con
    int index2 = s1.indexOf("java");
    System.out.println("index2 = " + index2);//Kết quả : index2 = 6

  }
}
