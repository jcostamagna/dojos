package com.mercadolibre.dojos;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Tests for the dojo. */
public class DojoTest {

  @Before
  public void setup() {}

  @Test
  public void test_case_00() {

    Solution solution = new Solution();

    int result = solution.findMistake(List.of(1, 3, 3, 4));
    Assert.assertEquals(5, result);
  }

  @Test
  public void test_case_01() {

    Solution solution = new Solution();

    int result = solution.findMistake(List.of(4, 3, 3, 1));
    Assert.assertEquals(5, result);
  }

  @Test
  public void test_case_02() {

    Solution solution = new Solution();

    int result = solution.findMistake(List.of(1, 1, 3, 4));
    Assert.assertEquals(3, result);
  }

  @Test
  public void test_case_03() {

    Solution solution = new Solution();

    int result = solution.findMistake(List.of(2, 2));
    Assert.assertEquals(3, result);
  }

  @Test
  public void test_case_04() {

    Solution solution = new Solution();

    int result = solution.findMistake(List.of(6, 3, 2, 4, 3, 1));
    Assert.assertEquals(8, result);
  }

  @Test
  public void test_case_05() {

    Solution solution = new Solution();

    int result = solution.findMistake(List.of(10, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    Assert.assertEquals(11, result);
  }
}
