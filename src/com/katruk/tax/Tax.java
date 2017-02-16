package com.katruk.tax;

public interface Tax {

  long TAX_RATE = 17;
  long ROYALTY_RATE = 5;
  long PROPERTY_SALE_RATE = 2;

  //in cent
  long calculate();

  String purposeOfPayment();
}
