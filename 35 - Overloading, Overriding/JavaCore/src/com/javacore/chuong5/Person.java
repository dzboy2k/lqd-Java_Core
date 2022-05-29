package com.javacore.chuong5;

/**
 * class mô tả thông tin của Person
 * @author Bryan Lee
 *
 */
public class Person {

  private String name;
  private int age;

  public Person(String name) {
    this.name = name;
  }

  //Constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
