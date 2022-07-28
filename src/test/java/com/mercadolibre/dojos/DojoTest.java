package com.mercadolibre.dojos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/** Tests for the dojo. */
public class DojoTest {

  @Before
  public void setup() {}

  /*
  Given a list of integers nums and an integer target, return indices of the 2 numbers such that they add up to target
  You may not use the same number twice

  Input: nums = [3,2,4], target = 6
  Output: [1,2]

  Input: nums = [3,2,3], target = 6
  Output: [0,2]

  Input: nums = [3,2,1], target = 6
  Output: []
   */

  @Test
  public void test_case_00() {

    Solution solution = new Solution();

    ArrayList<Integer> indexes = solution.findSumIntegers(List.of(3,2,4), 6);

    ArrayList<Integer> expectedIndexes = new ArrayList<>();

    expectedIndexes.add(1);
    expectedIndexes.add(2);

    Assert.assertEquals(expectedIndexes, indexes);
  }

  @Test
  public void test_case_01() {

    Solution solution = new Solution();

    ArrayList<Integer> indexes = solution.findSumIntegers(List.of(3,2,3), 6);

    ArrayList<Integer> expectedIndexes = new ArrayList<>();

    expectedIndexes.add(0);
    expectedIndexes.add(2);

    Assert.assertEquals(expectedIndexes, indexes);
  }

  @Test
  public void test_case_02() {

    Solution solution = new Solution();

    ArrayList<Integer> indexes = solution.findSumIntegers(List.of(3,2,1), 6);

    ArrayList<Integer> expectedIndexes = new ArrayList<>();

    Assert.assertEquals(expectedIndexes, indexes);
  }

}
