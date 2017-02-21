package com.katruk.tax;

import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class IndividualTaxes implements Taxes {

  private final Collection<Tax> taxes = new HashSet<>();

  public IndividualTaxes with(Tax tax) {
    this.taxes.add(tax);
    return this;
  }

  @Override
  public long calculateAll() throws IOException {
    long sum = 0;
    for (Tax tax : this.taxes) {
      sum += tax.calculate();
    }
    return sum;
//    return this.taxes.stream().mapToLong(Tax::calculate).sum();
  }

  @Override
  public int count() {
    return this.taxes.size();
  }

  @Override
  public Collection<String> purposeOfPayments() throws IOException {
    Collection<String> purposes = new HashSet<>();
    for (Tax tax : this.taxes) {
      purposes.add(tax.purposeOfPayment());
    }
    return purposes;
//    return this.taxes.stream().map(Tax::purposeOfPayment)
//        .collect(Collectors.toCollection(ArrayList::new));
  }

  @Override
  public Collection<String> purposeOfPayments(Comparator comparator) throws IOException {
    Collection<String> purposes = new TreeSet<>();
    for (Tax tax : this.taxes) {
      purposes.add(tax.purposeOfPayment());
    }

//    Collections.sort(purposes, comparator);

    return purposes;

//    return this.taxes.stream().sorted((t1, t2) -> compare(t1.calculate(), t2.calculate()))
//        .map(Tax::purposeOfPayment)
//        .collect(Collectors.toCollection(ArrayList::new));
  }
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