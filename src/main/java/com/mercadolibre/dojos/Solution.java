package com.mercadolibre.dojos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] a) {
        int result = 1;

        List<Integer> sortedArray = Arrays.stream(a).sorted().boxed().collect(Collectors.toList());

        for(Integer integer : sortedArray) {
            if(integer == result) {
                result++;
            }
        }
        return result;
    }
}
