package com.javacore.chuong5;

public class SinhVien {

  private int id;
  private String name;
  private String email;

  public SinhVien(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public SinhVien(int id, String name, String email) {
    this(id, name);
    this.email = email;
  }

  public void display() {
    System.out.println(name);

    this.showEmail();
  }

  public void showEmail() {
    System.out.println(email);
  }

  public static void main(String[] args) {

    SinhVien sv1 = new SinhVien(1,"Sinh Vien 1");
    sv1.display();

    SinhVien sv2 = new SinhVien(1,"Sinh Vien 2","sv2@gmail.com");
    sv2.display();


  }

}
