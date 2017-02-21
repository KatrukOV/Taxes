package com.katruk.tax;

import java.io.IOException;

public interface Tax {

  long TAX_RATE = 17;
  long ROYALTY_RATE = 5;
  long PROPERTY_SALE_RATE = 2;

  //in cent
  long calculate() throws IOException;

  String purposeOfPayment() throws IOException;
}
