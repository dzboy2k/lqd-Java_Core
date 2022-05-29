package com.javacore.chuong5;

public class TestBankAccount {

  public static void main(String[] args) {

    BankAccount account = new BankAccount();

    // chuyển tiền
    account.deposit(-10);

    // Hiển thị balance
    System.out.println(account.getBalance());
  }
}
