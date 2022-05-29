package com.javacore;

public class BienInstance {

  String name;
  int age;

  public BienInstance() {

  }

  public BienInstance(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void show() {
    System.out.println(name);
    System.out.println(age);
  }

  public static void main(String[] args) {
    BienInstance object1 = new BienInstance();
    object1.show();

    BienInstance object2 = new BienInstance("Test",15);
    object2.show();

  }

}
