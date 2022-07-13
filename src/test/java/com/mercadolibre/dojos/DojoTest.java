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

    int result = solution.bracketMatch("()");

    Assert.assertEquals(0, result);
  }

  @Test
  public void test_case_01() {

    Solution solution = new Solution();

    int result = solution.bracketMatch("((())");

    Assert.assertEquals(1, result);
  }

  @Test
  public void test_case_02() {

    Solution solution = new Solution();

    int result = solution.bracketMatch("((()))");

    Assert.assertEquals(0, result);
  }

  @Test
  public void test_case_03() {

    Solution solution = new Solution();

    int result = solution.bracketMatch("()))");

    Assert.assertEquals(2, result);
  }

  @Test
  public void test_case_04() {

    Solution solution = new Solution();

    int result = solution.bracketMatch(")))");

    Assert.assertEquals(3, result);
  }

  @Test
  public void test_case_05() {

    Solution solution = new Solution();

    int result = solution.bracketMatch(")(");

    Assert.assertEquals(2, result);
  }

  @Test
  public void test_case_06() {

    Solution solution = new Solution();

    int result = solution.bracketMatch(")))(((");

    Assert.assertEquals(6, result);
  }
}
