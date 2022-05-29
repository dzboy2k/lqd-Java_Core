package com.javacore.chuong5;

public class Dog extends Animal {
  void bark() {
    System.out.println("barking...");
    System.out.println();
  }

  void show() {
    System.out.println(name);
  }

  public static void main(String[] args) {
    Dog d = new Dog();
    d.bark();
    d.eat();
    d.show();
  }
}
