package com.mercadolibre.dojos;

public class Solution {
  public int bracketMatch(String brackets) {
    int openBrackets = 0;
    int closeBrackets = 0;
    for (int i = 0; i < brackets.length(); i++) {
      char character = brackets.charAt(i);
      if (character == '(') {
        openBrackets += 1;
      }
      if (character == ')') {
        if (openBrackets > 0) {
          openBrackets = openBrackets - 1;
        } else {
          closeBrackets += 1;
        }
      }
    }
    return openBrackets + closeBrackets;
  }
}
