package com.mercadolibre.dojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
  public int delete_distance(String str1, String str2) {
    if (str1.equals(str2)) {
      return 0;
    }

    Integer distance = 0;

    StringBuffer string1 = new StringBuffer(str1);
    StringBuffer string2 = new StringBuffer(str2);

    String filteredString1 = this.deleteExtraCharactersFromFirstString(string1, string2);
    distance += str1.length() - filteredString1.length();
    String filteredString2 = this.deleteExtraCharactersFromFirstString(string2, string1);
    distance += str2.length() - filteredString2.length();

    if (filteredString1.equals(filteredString2)) {
      return distance;
    }

    return distance + this.removeDuplicated(filteredString1, filteredString2);
  }

  private int removeDuplicated(String string1, String string2) {
    return this.levenshteinDistance(string1, string2);
  }

  private int levenshteinDistance(String string1, String string2) {
    int[][] matrix = new int[string1.length()][string2.length()];

    Arrays.stream(matrix)
        .forEach((int[] array) -> Arrays.fill(array, string1.length() + string2.length()));
    matrix[0][0] = 0;

    for (int i = 0; i < string1.length(); i++) {
      for (int j = 0; j < string2.length(); j++) {
        int jMinusOne = j == 0 ? 0 : j - 1;
        int iMinusOne = i == 0 ? 0 : i - 1;

        int distance =
            Math.min(
                Math.min(matrix[i][jMinusOne], matrix[iMinusOne][j]), matrix[iMinusOne][jMinusOne]);

        if (string1.charAt(i) != string2.charAt(j)) {
          distance += 1;
        }

        matrix[i][j] = distance;
      }
    }

    return matrix[string1.length() - 1][string2.length() - 1];
  }

  private String deleteExtraCharactersFromFirstString(StringBuffer string1, StringBuffer string2) {
    String str1 = string1.toString();
    ArrayList<Integer> indexes = new ArrayList();
    for (int i = 0; i < str1.length(); i++) {
      if (string2.toString().indexOf(str1.charAt(i)) == -1) {
        indexes.add(i);
      }
    }
    Collections.reverse(indexes);
    for (Integer index : indexes) {
      string1 = string1.deleteCharAt(index);
    }

    return string1.toString();
  }
}
