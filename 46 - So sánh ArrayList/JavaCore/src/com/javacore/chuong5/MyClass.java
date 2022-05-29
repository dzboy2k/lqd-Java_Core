package com.javacore.chuong5;

public class MyClass {
  public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();

    //Đếm số đối tượng được tạo ra từ class Counter
    System.out.println("Count:" + Counter.COUNT);

    // call static method
    Counter.sayHi();
  }
}
