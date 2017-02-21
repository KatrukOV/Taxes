package com.katruk.property;

import java.io.IOException;

public class PropertySaleAPI implements Property {

  private final Text text;

  public PropertySaleAPI() {
    this(new ConsoleText());
  }

  public PropertySaleAPI(Text text) {
    this.text = text;
  }


  @Override
  public long cost() {
    // remove to front
    System.out.println("input cost in cent:");
    try {
      return Long.parseLong(this.text.context());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return 0;
  }

  @Override
  public String name() {
    // remove to front
    System.out.println("input name:");
    try {
      return this.text.context();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "";
  }

}
