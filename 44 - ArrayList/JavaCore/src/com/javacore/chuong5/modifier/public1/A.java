package com.javacore.chuong5.modifier.public1;

public class A {
  private void msg() {
    System.out.println("Hello");
  }

  public void display() {
    System.out.println("display method");
    this.msg();
  }
}
