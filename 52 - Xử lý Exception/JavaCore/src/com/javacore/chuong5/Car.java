package com.javacore.chuong5;

public class Car {

  private String name;

  public Car(String name) {
    this.name = name;
  }

  public void show() {
    System.out.println(name);
  }


  public static void main(String[] args) {

    Car toyota = new Car("Toyota");
    Car ford = new Car("Ford");

    toyota.show();
    ford.show();


  }

}
