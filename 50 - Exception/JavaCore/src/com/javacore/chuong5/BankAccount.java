package com.javacore.chuong5;

public class BankAccount {

  private double balance = 0;

  public void deposit(double x) {
    if (x > 0) {
      this.balance += x;
    }
  }

  public double getBalance() {
    return balance;
  }
}
