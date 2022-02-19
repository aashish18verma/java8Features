package com.company.streams;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAvgSummarizing {
    public static void main(String[] args) {
        Set<Integer> numSet = new HashSet<>();
        numSet.add(15);
        numSet.add(35);
        numSet.add(44);
        numSet.add(73);
        numSet.add(13);

        System.out.println(numSet.stream().collect(Collectors.averagingInt(x->x)));

        IntSummaryStatistics summaryStatistics = numSet.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println(summaryStatistics);
        System.out.println(summaryStatistics.getMax());

        Set<Integer> numSet2 = new HashSet<>();
        numSet2.add(15);
        numSet2.add(35);
        numSet2.add(44);
        numSet2.add(73);
        numSet2.add(13);

        IntSummaryStatistics summary2 = numSet2.stream().collect(Collectors.summarizingInt(x->x));

        summaryStatistics.combine(summary2);

        System.out.println(summaryStatistics);
    }
}
