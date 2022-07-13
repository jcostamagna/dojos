package com.mercadolibre.dojos;

import java.util.List;

public class Solution {
  public boolean canReachEnd(List<Integer> integers) {
    int index = 0;

    while (index < integers.size() - 1) {

      if (integers.get(index) == 0) {
        return false;
      }

      index += integers.get(index);
    }

    return true;
  }
}
