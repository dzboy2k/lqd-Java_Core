package com.javacore.chuong5.polymorphism;

class Animal {
  public void makeSound() {
    System.out.println("default ...");
  }
}

class Cat extends Animal {

  @Override
  public void makeSound() {
    System.out.println("Meo meo");
  }
}

class Dog extends Animal {

  @Override
  public void makeSound() {
    System.out.println("Go go");
  }
}

public class TestPolymorphism {

  public static void main(String[] args) {

    Animal a = new Dog();
    Animal b = new Cat();

    a.makeSound(); // Go go
    b.makeSound(); // Meo meo
    //Bạn thấy a, b đều là Animal nhưng khi gọi makeSound() ứng xử là khác nhau, đó là tính đa hình
  }
}
