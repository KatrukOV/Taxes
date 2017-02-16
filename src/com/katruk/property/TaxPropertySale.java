package com.katruk.property;

import com.katruk.tax.Tax;

public class TaxPropertySale implements Tax {

  private final Property property;

  public TaxPropertySale(Property property) {
    this.property = property;
  }


  @Override
  public long calculate() {
    return this.property.cost() * PROPERTY_SALE_RATE / 100;
  }

  @Override
  public String purposeOfPayment() {
    return String.format("Property: '%s' with cost = %d $.",
                         this.property.name(),
                         this.property.cost() / 100
    );
  }
}