package com.javacore.chuong5;

public class A implements IPrinTable3 {

  public static void main(String[] args) {

    A a = new A();
    a.print();
    a.show();
    a.display();
  }

  @Override
  public void print() {
    System.out.println("Hello");

  }

  @Override
  public void show() {
    System.out.println("Show Hello");
    System.out.println(PI);

  }

  @Override
  public void display() {

    System.out.println("display method");

  }

}
