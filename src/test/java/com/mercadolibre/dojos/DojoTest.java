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

    int result = solution.nearestPowerOfTwo(2);

    Assert.assertEquals(2, result);
  }

  @Test
  public void test_case_01() {

    Solution solution = new Solution();

    int result = solution.nearestPowerOfTwo(1);

    Assert.assertEquals(1, result);
  }

  @Test
  public void test_case_02() {

    Solution solution = new Solution();

    int result = solution.nearestPowerOfTwo(4);

    Assert.assertEquals(4, result);
  }

  @Test
  public void test_case_03() {

    Solution solution = new Solution();

    int result = solution.nearestPowerOfTwo(8);

    Assert.assertEquals(8, result);
  }

  @Test
  public void test_case_04() {

    Solution solution = new Solution();

    int result = solution.nearestPowerOfTwo(16);

    Assert.assertEquals(16, result);
  }

  @Test
  public void test_case_05() {

    Solution solution = new Solution();

    int result = solution.nearestPowerOfTwo(15);

    Assert.assertEquals(8, result);
  }

  @Test
  public void test_case_06() {

    Solution solution = new Solution();

    int result = solution.nearestPowerOfTwo(10);

    Assert.assertEquals(8, result);
  }

  @Test
  public void test_case_07() {

    Solution solution = new Solution();

    int result = solution.nearestPowerOfTwo(17);

    Assert.assertEquals(16, result);
  }

  @Test
  public void test_case_08() {

    Solution solution = new Solution();

    int result = solution.nearestPowerOfTwo(31);

    Assert.assertEquals(16, result);
  }
}
