package com.katruk.text;

import java.io.IOException;

public interface Text {

  String context() throws IOException;

  enum Encoding {
    UTF8("UTF-8"),
    ASCII("ASCII"),
    Cp1251("Cp1251");

    private String value;

    Encoding(String s) {
      this.value = s;
    }

    @Override
    public String toString() {
      return this.value;
    }
  }
}
