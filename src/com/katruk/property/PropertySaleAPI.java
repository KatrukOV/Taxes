package com.katruk.property;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PropertySaleAPI implements Property {

  private final BufferedReader reader;

  public PropertySaleAPI() {
    this(new BufferedReader(new InputStreamReader(System.in)));
  }

  public PropertySaleAPI(BufferedReader reader) {
    this.reader = reader;
  }

  @Override
  public long cost() throws IOException {
    System.out.println("input cost:");
    return Long.parseLong(this.reader.readLine());
  }

  @Override
  public String name() throws IOException {
    System.out.println("input name:");
    return this.reader.readLine();
  }
}
