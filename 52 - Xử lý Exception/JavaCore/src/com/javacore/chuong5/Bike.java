package com.javacore.chuong5;

/**
 * Lớp cha
 * @author Bryan Lee
 *
 */
class Vehicle {
  int speed = 50;

  void showMe() {
    System.out.println("Show me...");
  }

}


public class Bike extends Vehicle {

  int speed = 100;

  void display() {
    System.out.println(speed); //in speed của lớp con Bike
  }

  void display1() {
    System.out.println(super.speed);//in speed của lớp cha Vehicle
    super.showMe();
  }

  public static void main(String[] args) {
    Bike b = new Bike();
    b.display();
    b.display1();
  }
}
