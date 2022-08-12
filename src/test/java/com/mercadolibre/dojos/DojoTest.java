package com.mercadolibre.dojos;

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

    int[] A = {1, 2, 3};

    int result = solution.solution(A);

    Assert.assertEquals(4, result);
  }

  @Test
  public void test_case_01() {

    Solution solution = new Solution();

    int[] A = {-1, -2, -3};

    int result = solution.solution(A);

    Assert.assertEquals(1, result);
  }

  @Test
  public void test_case_02() {

    Solution solution = new Solution();

    int[] A = {1, 3, 6, 4, 1, 2};

    int result = solution.solution(A);

    Assert.assertEquals(5, result);
  }

  @Test
  public void test_case_03() {

    Solution solution = new Solution();

    int[] A = {};

    int result = solution.solution(A);

    Assert.assertEquals(1, result);
  }
}
