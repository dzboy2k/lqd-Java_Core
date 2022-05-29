package com.javacore.io;

import java.io.*;

public class CopyFileBuffer1 {
  public static void main(String[] args) throws IOException {
    BufferedInputStream bufferIn = null;
    BufferedOutputStream bufferOut = null;

    try {
      InputStream inputStream = new FileInputStream("src/input.txt");
      OutputStream outputStream = new FileOutputStream("src/output.txt");

      bufferIn = new BufferedInputStream(inputStream);
      bufferOut = new BufferedOutputStream(outputStream);

      int c;
      while ((c = bufferIn.read()) != -1) {
        bufferOut.write(c);
      }
    } finally {
      if (bufferIn != null) {
        bufferIn.close();
      }
      if (bufferOut != null) {
        bufferOut.close();
      }
    }
  }
}
