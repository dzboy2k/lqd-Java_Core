package com.javacore.chuong5;

public class ReferenceTypeTest {
  public static void main(String[] args) {
    Person p;
    p = new Person("John");
    p.setAge(20);
    celebrateBirthday(p);
    System.out.println(p.getAge());
  }

  static void celebrateBirthday(Person p) {
    p.setAge(p.getAge() + 1);
  }
}
//Result : 21