package com.mercadolibre.dojos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/** Tests for the dojo. */
public class DojoTest {

  @Before
  public void setup() {}

  @Test
  public void test_case_00() {

    Solution solution = new Solution();

    Map<String, UserStats> visits = new HashMap<>();
    visits.put("asd", new UserStats(Optional.of(1L)));
    visits.put("1", null);
    visits.put("2", new UserStats(Optional.empty()));
    visits.put("3", new UserStats(Optional.of(1L)));


    Map<Long, Long> result = solution.count(new Map[]{visits});

    Map<Long, Long> expected = new HashMap<>();

    expected.put(3L, 1L);

    Assert.assertEquals(expected, result);
  }

  @Test
  public void test_case_01() {

    Solution solution = new Solution();

    Map<Long, Long> result = solution.count(null);

    Map<Long, Long> expected = new HashMap<>();

    Assert.assertEquals(expected, result);
  }

  @Test
  public void test_case_02() {

    Solution solution = new Solution();

    Map<String, UserStats> visits = new HashMap<>();
    visits.put("asd", new UserStats(Optional.of(1L)));
    visits.put("1", null);
    visits.put("2", new UserStats(Optional.empty()));
    visits.put("3", new UserStats(Optional.of(1L)));

    Map<String, UserStats> visits2 = null;

    Map<Long, Long> result = solution.count(new Map[]{visits, visits2});

    Map<Long, Long> expected = new HashMap<>();

    expected.put(3L, 1L);


    Assert.assertEquals(expected, result);
  }

  @Test
  public void test_case_03() {

    Solution solution = new Solution();

    Map<String, UserStats> visits = new HashMap<>();
    visits.put("asd", new UserStats(Optional.of(1L)));
    visits.put("1", null);
    visits.put("2", new UserStats(Optional.empty()));
    visits.put("3", new UserStats(Optional.of(1L)));

    Map<String, UserStats> visits2 = new HashMap<>();

    visits.put("3", new UserStats(Optional.of(1L)));


    Map<Long, Long> result = solution.count(new Map[]{visits, visits2});

    Map<Long, Long> expected = new HashMap<>();

    expected.put(3L, 2L);


    Assert.assertEquals(expected, result);
  }
}
