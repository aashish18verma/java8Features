package com.company.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileCaseStudy {
    public static void main(String[] args) throws IOException {
        Stream<String> rowData = Files.lines(Paths.get(System.getProperty("user.dir")+"/"+"salesdata.csv"));
        //System.out.println(rowData);
        //get only data which has sales info
        // cheese,8000,2020

        //Integer totalRows = (int) rowData.map(x->x.split(",")).filter(f-> f.length>2).count();
       // System.out.println(totalRows);
       // List<String[]> itemSalesGT8000 = rowData.map(x->x.split(",")).filter(f-> f.length>2).collect(Collectors.toList());

       /* for (String[] s:itemSalesGT8000) {
            System.out.println("pizza name: "+s[0]+" sales data: "+s[1]);
        }*/
       // System.out.println(itemSalesGT8000);

      /* Map<String,Integer> map = rowData.map(x->x.split(",")).filter(f->f.length>2)
                .collect(Collectors.toMap(x->(String)x[0],y-> Integer.parseInt(y[1])));
        System.out.println(map);*/


        //find the total sales of pizza in  year 2020

      Optional<Integer> totalSalesOf2020 = rowData.map(x->x.split(",")).filter(f->f.length>2).map(y->Integer.parseInt(y[1])).reduce((x, y) -> x+y);

        System.out.println(totalSalesOf2020.get());

    }
}
