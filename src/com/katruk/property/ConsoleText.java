package com.katruk.property;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ConsoleText implements Text {

  private final InputStream inputStream;
  private final String encoding;


  public ConsoleText() {
    this(System.in, "UTF-8");
  }

  public ConsoleText(String encoding) {
    this(System.in, encoding);
  }

  public ConsoleText(InputStream inputStream) {
    this(inputStream, "UTF-8");
  }

  public ConsoleText(InputStream inputStream, String encoding) {
    this.inputStream = inputStream;
    this.encoding = encoding;
  }

  @Override
  public String context() throws IOException {
    try (ByteArrayOutputStream result = new ByteArrayOutputStream()) {
      byte[] buffer = new byte[1024];
      int length;
      while ((length = this.inputStream.read(buffer)) != -1) {
        result.write(buffer, 0, length);
      }
      return result.toString(this.encoding);
    }
  }
}