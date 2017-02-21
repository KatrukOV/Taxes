package com.katruk;

import static com.katruk.tax.Taxes.ByCost;

import com.katruk.property.PropertySaleAPI;
import com.katruk.property.PropertySaleFile;
import com.katruk.property.TaxPropertySale;
import com.katruk.tax.IndividualTaxes;
import com.katruk.tax.Taxes;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
//    Taxes taxes = new IndividualTaxes()
//        .with(new TaxJob(new PrimaryJob(new StandardJob(120_000_00, "Lead"), "IBM")))
//        .with(new TaxJob(new SecondaryJob(new StandardJob(90_000_00, "PM"))))
//        .with(new TaxRoyalty(new RoyaltySimply(10_000_00, "My book")))
//        .with(new TaxPropertySale(new PropertySale("Flat 4 room", 300_000_00)))
//        .with(new TaxPropertySale(new PropertySale("Country house", 250_000_00)));
//
//    System.out.println("==================== ALL purpose of Payments =====================");
//    taxes.purposeOfPayments().forEach(System.out::println);
//    System.out.println("==================================================================");
//    taxes.purposeOfPaymentsByCost().forEach(System.out::println);
//    System.out.println("==================================================================");
//    System.out.println(String.format("count of taxes = %d ", taxes.count()));
//    System.out.println(String.format("result of taxes = %d", taxes.calculateAll() / 100));
//
//    System.out.println("==================================================================");

    Taxes taxes1 = new IndividualTaxes()
//        .with(new TaxJob(new PrimaryJob(new StandardJob(120_000_00, "Lead"), "IBM")))
//        .with(new TaxJob(new SecondaryJob(new StandardJob(90_000_00, "PM"))))
//        .with(new TaxRoyalty(new RoyaltySimply(10_000_00, "My book")))
//        .with(new TaxPropertySale(new PropertySale("Flat 4 room", 300_000_00)))
        .with(new TaxPropertySale(new PropertySaleFile("property.json", new PropertySaleAPI())))
        .with(new TaxPropertySale(new PropertySaleFile("property.json", new PropertySaleAPI())))
        .with(new TaxPropertySale(new PropertySaleFile("property.json", new PropertySaleAPI())));

    System.out.println("==================== ALL purpose of Payments =====================");
    taxes1.purposeOfPayments().forEach(System.out::println);
    System.out.println("==================================================================");
    taxes1.purposeOfPayments(ByCost).forEach(System.out::println);

//    Collection<String> s = taxes1.purposeOfPayments(ByCost);

    System.out.println("==================================================================");
    System.out.println(String.format("count of taxes = %d ", taxes1.count()));
//    System.out.println(String.format("result of taxes = %d $", taxes1.calculateAll() / 100));

  }
}