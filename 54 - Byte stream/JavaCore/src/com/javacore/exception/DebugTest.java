package com.javacore.exception;

class SinhVien {

  private int id;
  private String name;

  public SinhVien(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

public class DebugTest {

  public static void main(String[] args) {
    SinhVien student = new SinhVien(1, "Sinh Vien A");
    checkStudent(student.getId());
    String hello = sayHello(student);
    System.out.println(hello);
  }

  public static String sayHello(SinhVien student) {
    return "Hello " + student.getName();
  }

  public static void checkStudent(Integer id) {
    if (id != null) {
      System.out.println("Valid");
    } else {
      System.out.println("Invalid");
    }
  }

}
