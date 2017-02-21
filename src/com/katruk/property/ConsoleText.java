package com.katruk.property;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsoleText implements Text {

  private final InputStream inputStream;
  private final Encoding encoding;


  public ConsoleText() {
    this(System.in, Encoding.UTF8);
  }

  public ConsoleText(Encoding encoding) {
    this(System.in, encoding);
  }

  public ConsoleText(InputStream inputStream) {
    this(inputStream, Encoding.UTF8);
  }

  public ConsoleText(InputStream inputStream, Encoding encoding) {
    this.inputStream = inputStream;
    this.encoding = encoding;
  }

  @Override
  public String context() throws IOException {
//    try (
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.inputStream));
//    ) {
    return bufferedReader.readLine();
//    }
  }
}

/*
@Override
  public String context() throws IOException {
    try (ByteArrayOutputStream result = new ByteArrayOutputStream()) {
      byte[] buffer = new byte[1024];
      int length;
      while ((length = this.inputStream.read(buffer)) != -1) {
        result.write(buffer, 0, length);
      }
      return result.toString(this.encoding.toString());
    }
  }
 */