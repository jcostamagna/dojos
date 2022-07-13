package com.mercadolibre.dojos;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
  public int findMistake(List<Integer> integers) {

    int duplicatedInt = this.findDuplicated(integers);

    int missingInt = this.findMissing(integers);

    return duplicatedInt + missingInt;
  }

  private int findMissing(List<Integer> integers) {
    List<Integer> integerStream =
        IntStream.rangeClosed(1, integers.size()).boxed().collect(Collectors.toList());

    for (Integer integer : integers) {
      integerStream.remove(integer);
    }

    return integerStream.stream().findFirst().orElse(0);
  }

  private int findDuplicated(List<Integer> integers) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (Integer integer : integers) {
      if (map.containsKey(integer)) {
        return integer;
      }
      map.put(integer, 1);
    }
    return 0;
  }
}
