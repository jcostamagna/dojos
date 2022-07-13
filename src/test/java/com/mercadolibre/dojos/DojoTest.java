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
    Assert.assertEquals(1, 1);
  }

  @Test(expected = RuntimeException.class)
  public void test_case_01() {

    throw new RuntimeException();
  }
}
