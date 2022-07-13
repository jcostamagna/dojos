package com.mercadolibre.dojos;

public class Solution {
  public int nearestPowerOfTwo(int integer) {
    int count = 1;
    for (int i = 0; i <= integer; i++) {
      if (count * 2 > integer) {
        return count;
      }
      count = count * 2;
    }
    return count;
  }
}
