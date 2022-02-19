package com.company.interfaceEnhancement.Predicate;

public class Stock {
    String name;
    Integer stockPrice;
    Integer stockQuantity;

     public Stock(String name, Integer stockPrice, Integer stockQuantity){
         this.name = name;
         this.stockPrice = stockPrice;
         this.stockQuantity= stockQuantity;
     }

    @Override
    public String toString(){
          return "Name: "+this.name+", Price: "+this.stockPrice+", StockQuantity: "+this.stockQuantity;
    }

    @Override
    public boolean equals(Object object){
         Stock stock= (Stock) object;
         if (name.equals(stock.name) &&
                 stockPrice.equals(stock.stockPrice) &&
                 stockQuantity.equals(stock.stockQuantity)) {
             return true;
         }
         else {
             return false;
         }
    }

}
