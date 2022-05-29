package com.javacore.chuong5;

public class Counter {
  //Thuộc tính tĩnh
  public static int COUNT = 0;

  Counter() {
    COUNT++;
  }

  //Phương thức tĩnh
  public static void sayHi() {
    System.out.println("Hello static method!");
  }
}
