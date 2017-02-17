package com.katruk.property;

import java.io.IOException;

public class PropertySaleFile implements Property {

  private final Property property;

  public PropertySaleFile(Property property) {
    this.property = property;
  }

  @Override
  public long cost() throws IOException {
    final long cost = this.property.cost();
    //save cost to file
    return cost;
  }

  @Override
  public String name() throws IOException {
    final String name = this.property.name();
    //save name to file
    return name;
  }
}
