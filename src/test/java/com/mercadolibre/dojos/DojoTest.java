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

    boolean result = solution.canReachEnd(List.of(0));

    Assert.assertTrue(result);
  }

  @Test
  public void test_case_01() {

    Solution solution = new Solution();

    boolean result = solution.canReachEnd(List.of(1, 2, 3));

    Assert.assertTrue(result);
  }

  @Test
  public void test_case_02() {

    Solution solution = new Solution();

    boolean result = solution.canReachEnd(List.of(5, 0, 0, 0, 0, 0));

    Assert.assertTrue(result);
  }

  @Test
  public void test_case_03() {

    Solution solution = new Solution();

    boolean result = solution.canReachEnd(List.of(0, 2, 4));

    Assert.assertFalse(result);
  }

  @Test
  public void test_case_04() {

    Solution solution = new Solution();

    boolean result = solution.canReachEnd(List.of(1, 2, 0, 0, 1));

    Assert.assertFalse(result);
  }

  @Test
  public void test_case_05() {

    Solution solution = new Solution();

    boolean result = solution.canReachEnd(List.of(5, 0, 0, 0, 0, 0, 0));

    Assert.assertFalse(result);
  }

  @Test
  public void test_case_06() {

    Solution solution = new Solution();

    boolean result = solution.canReachEnd(List.of(0, 0));

    Assert.assertFalse(result);
  }
}
