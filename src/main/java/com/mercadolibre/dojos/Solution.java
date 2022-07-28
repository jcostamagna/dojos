package com.mercadolibre.dojos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public ArrayList<Integer> findSumIntegers(List<Integer> integers, int target) {

        List<Integer> sortedIntegers = integers.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < sortedIntegers.size() - 1; i++) {
            List<Integer> subList = sortedIntegers.subList(i + 1, integers.size());

            boolean integerFound = this.findInteger(subList, target - sortedIntegers.get(i));

            if (integerFound) {
                int firstIndex = integers.indexOf(sortedIntegers.get(i));
                int lastIndex = integers.lastIndexOf(target - sortedIntegers.get(i));

                return new ArrayList<>(List.of(firstIndex, lastIndex));
            }

        }

        return new ArrayList<>();
    }

    private boolean findInteger(List<Integer> subList, int target) {
        return Collections.binarySearch(subList, target) >= 0;
    }
}
