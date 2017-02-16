package com.katruk.tax;

import static java.lang.Long.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class IndividualTaxes implements Taxes {

  private final Collection<Tax> taxes = new HashSet<>();

  public IndividualTaxes with(Tax tax) {
    this.taxes.add(tax);
    return this;
  }

  @Override
  public long calculateAll() {
    return this.taxes.stream().mapToLong(Tax::calculate).sum();
  }

  @Override
  public int count() {
    return this.taxes.size();
  }

  @Override
  public Collection<String> purposeOfPayments() {
    return this.taxes.stream().map(Tax::purposeOfPayment)
        .collect(Collectors.toCollection(ArrayList::new));
  }

  @Override
  public Collection<String> purposeOfPaymentsByCost() {
    return this.taxes.stream().sorted((t1, t2) -> compare(t1.calculate(), t2.calculate()))
        .map(Tax::purposeOfPayment)
        .collect(Collectors.toCollection(ArrayList::new));
  }
//
//  public Collection<String> purposeOfPayments(Comparator comparator) {
//    return this.taxes.stream().map(Tax::purposeOfPayment)
//        .collect(Collectors.toCollection(ArrayList::new));
//  }
}

/*
public long calculateAll() {
    long sum = 0;
    for (Tax tax : this.taxes) {
      sum += tax.calculate();
    }
    return sum;
  }
*/