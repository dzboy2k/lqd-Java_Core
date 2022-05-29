package com.javacore.io;

import java.io.*;

public class CopyFileBuffer2 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = null;
    BufferedWriter bufferedWriter = null;

    try {
      Reader reader = new FileReader("src/input.txt");
      Writer writer = new FileWriter("src/output.txt");

      bufferedReader = new BufferedReader(reader);
      bufferedWriter = new BufferedWriter(writer);

      int c;
      while ((c = bufferedReader.read()) != -1) {
        bufferedWriter.write(c);
      }
    } finally {
      if (bufferedReader != null) {
        bufferedReader.close();
      }
      if (bufferedWriter != null) {
        bufferedWriter.close();
      }
    }
  }
}
