package com.javacore.exception;

public class UncheckedExceptionDemo {

  public static void main(String[] args) {
    UncheckedExceptionDemo.testUncheckedException();
  }

  public static void testUncheckedException() throws MyUncheckedException {
    System.out.println("unchecked exception demo!");
    throw new MyUncheckedException("unchecked exception");
  }

}
