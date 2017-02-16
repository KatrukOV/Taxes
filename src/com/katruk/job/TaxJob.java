package com.katruk.job;

import com.katruk.tax.Tax;

public class TaxJob implements Tax {

  private final Job job;

  public TaxJob(Job job) {
    this.job = job;
  }

  @Override
  public long calculate() {
    return this.job.salary() * TAX_RATE / 100;
  }

  @Override
  public String purposeOfPayment() {
    return String.format("For work in position '%s' by salary = %d $.",
                         this.job.position(),
                         this.job.salary() / 100);
  }
}