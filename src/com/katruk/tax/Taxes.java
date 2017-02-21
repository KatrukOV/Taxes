package com.katruk.tax;

import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;

public interface Taxes {

  long calculateAll() throws IOException;

  int count() throws IOException;

  Collection<String> purposeOfPayments() throws IOException;

  Collection<String> purposeOfPayments(Comparator<Tax> comparator) throws IOException;

  final class ByCost implements Comparator<Tax> {

    @Override
    public int compare(Tax o1, Tax o2) {
      try {
        return (int) (o1.calculate() - o2.calculate());
      } catch (IOException e) {
        e.printStackTrace();
      }
      return 0;
    }
  }

  final class ByPurpose implements Comparator<Tax> {

    @Override
    public int compare(Tax o1, Tax o2) {
      try {
        return o1.purposeOfPayment().compareTo(o2.purposeOfPayment());
      } catch (IOException e) {
        e.printStackTrace();
      }
      return 0;
    }
  }

}
