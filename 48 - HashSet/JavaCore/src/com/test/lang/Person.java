package com.test.lang;

public class Person implements IPerson {

  @Override
  public void show() {
    System.out.println("Hello");

  }

  public static void main(String[] args) {
    IPerson p = new Person();
    p.show();
  }

}
