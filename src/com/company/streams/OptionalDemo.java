package com.company.streams;

import netscape.javascript.JSUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
        public static void main(String[] args) {
        List<String> flats = Arrays.asList("B01","B08","T01","T07","B11","B05","T07");
           Optional<String> result = flats.stream().filter(flat->flat.startsWith("C")).findFirst();

         /*  if(result.isPresent()){
               System.out.println(result.get());
           }
           else {
               System.out.println("no result found");
           }*/
         /*   result.ifPresent(System.out::println);
            System.out.println(result.orElseGet(()-> {return "no data present";}));
            result.orElseThrow(()-> {return new RuntimeException("no data present");});*/
            Optional<String> opt1 = Optional.of("java is awesome");
            System.out.println(opt1);
            System.out.println(opt1.get());
            Optional<String> opt2 = Optional.ofNullable(null);
            System.out.println(opt2);
            Optional<String> opt3 = Optional.ofNullable("hello");
            System.out.println(opt3.get());



    }
}
