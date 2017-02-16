package com.katruk;

import com.katruk.job.StandardJob;
import com.katruk.job.TaxJob;
import com.katruk.job.primary.PrimaryJob;
import com.katruk.job.secondary.SecondaryJob;
import com.katruk.property.PropertySale;
import com.katruk.property.TaxPropertySale;
import com.katruk.royalty.RoyaltySimply;
import com.katruk.royalty.TaxRoyalty;
import com.katruk.tax.IndividualTaxes;
import com.katruk.tax.Taxes;

public class Main {

  public static void main(String[] args) {
    Taxes taxes = new IndividualTaxes()
        .with(new TaxJob(new PrimaryJob(new StandardJob(120_000_00, "Lead"), "IBM")))
        .with(new TaxJob(new SecondaryJob(new StandardJob(90_000_00, "PM"))))
        .with(new TaxRoyalty(new RoyaltySimply(10_000_00, "My book")))
        .with(new TaxPropertySale(new PropertySale("Flat 4 room", 300_000_00)))
        .with(new TaxPropertySale(new PropertySale("Country house", 250_000_00)));

    System.out.println("==================== ALL purpose of Payments =====================");
    taxes.purposeOfPayments().forEach(System.out::println);
    System.out.println("==================================================================");
    taxes.purposeOfPaymentsByCost().forEach(System.out::println);
    System.out.println("==================================================================");
    System.out.println(String.format("count of taxes = %d ", taxes.count()));
    System.out.println(String.format("result of taxes = %d", taxes.calculateAll() / 100));
  }
}