package com.company.interfaceEnhancement.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class  Trading {


    public static void main(String[] args) {
        ArrayList<Stock> stockArrayList = new ArrayList<>();
        Stock StockToSearch = new Stock("Facebook", 400, 20);


        stockArrayList.add(new Stock("Apple", 500, 20));
        stockArrayList.add(new Stock("Facebook", 400, 20));
        stockArrayList.add(new Stock("Google", 300, 10));


        Predicate<Stock> stockEquality = Predicate.isEqual(StockToSearch);

        for (Stock s : stockArrayList) {
            if (stockEquality.test(s)) {
                System.out.println("Stock found " + s);
            }
        }
    }
}