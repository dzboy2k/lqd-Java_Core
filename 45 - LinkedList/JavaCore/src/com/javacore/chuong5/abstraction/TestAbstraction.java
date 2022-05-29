package com.javacore.chuong5.abstraction;


abstract class Animal {
  abstract void makeSound();
}

class Cat extends Animal {

  @Override
  void makeSound() {
    System.out.println("Meo meo");
  }
}

public class TestAbstraction {

  public static void main(String[] args) {
    Animal cat = new Cat();
    cat.makeSound();
  }
}
