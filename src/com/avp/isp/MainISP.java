package com.avp.isp;

import java.util.ArrayList;
import java.util.List;

public class MainISP {
    public static void main(String args[]) {
        Product product = new Product();
        product.setProductId(10);
        product.setProductName("IPHONE XS MAX");

        List<Product> products = new ArrayList<>();
        products.add(product);

        Customer customer = new Customer();
        customer.setName("Anh Viet Pham");

        CustomerTransaction customerTransaction = new CustomerTransaction(customer, products);

        AccountReceivable accountReceivable = new AccountReceivable(customerTransaction);
        accountReceivable.sendInvoice();
        accountReceivable.postPayment();

        ReportGenerator reportGenerator = new ReportGenerator(customerTransaction);
        reportGenerator.generateReport();
    }
}
