package com.katruk.property;

import java.io.File;

public class PropertySaleFile implements Property {

  private final File file;
  private final Property property;

  public PropertySaleFile(String fileName, Property property) {
    this(new File(fileName), property);
  }

  public PropertySaleFile(File file, Property property) {
    this.file = file;
    this.property = property;
  }

  @Override
  public long cost() {
    final long cost;

    cost = this.property.cost();

    //save cost to file
    return cost;
  }

  @Override
  public String name() {
    final String name;

    name = this.property.name();

    //save name to file
    return name;
  }


}


