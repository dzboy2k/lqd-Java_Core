package com.javacore;

public class DatTenBien {

  // Day la bien static
  public static float PI = 3.14f;

  //Day la bien instance
  int n ;

  public DatTenBien(int n) {
    this.n= n;
  }

  public static void main(String[] args) {

    String firstName = "Test";

    System.out.println("Static : " + DatTenBien.PI );
    System.out.println("Local :" + firstName);

    DatTenBien object = new DatTenBien(5);


    System.out.println("instance :" + object.n);

  }

}
