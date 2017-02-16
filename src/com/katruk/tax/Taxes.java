package com.katruk.tax;

import java.util.Collection;

public interface Taxes {

  long calculateAll();

  int count();

  Collection<String> purposeOfPayments();

  Collection<String> purposeOfPaymentsByCost();

}
