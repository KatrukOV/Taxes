package com.katruk.tax;

import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;

public interface Taxes {

  long calculateAll() throws IOException;

  int count() throws IOException;

  Collection<String> purposeOfPayments() throws IOException;

  Collection<String> purposeOfPayments(Comparator comparator) throws IOException;

  final class ByCost implements Comparable<Tax> {

//    @Override
//    public int compare(Tax o1, Tax o2) {
//      try {
//        return (int) (o1.calculate() - o2.calculate());
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//      return 0;
//    }

    @Override
    public int compareTo(Tax o) {

      try {
        return (this.calculate() - o.calculate());
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
