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
  Product -> String name, int price
  “Table”, 400
  “Chair”, 200
  “Tablet”, 300
  “TV”, 400
  “Phone”, 300
  “keyboard,” 100
  segundosMasCaros
   */
  @Test
  public void test_case_00() {

    Solution solution = new Solution();

    ArrayList<Product> productArrayList = new ArrayList<>();

    productArrayList.add(new Product("Table", 400));
    productArrayList.add(new Product("Chair", 200));
    productArrayList.add(new Product("Tablet", 300));
    productArrayList.add(new Product("TV", 400));
    productArrayList.add(new Product("Phone", 300));
    productArrayList.add(new Product("keyboard", 100));

    List<String> results = solution.findSecondLineProducts(productArrayList);


    Assert.assertEquals(List.of("Tablet", "Phone"), results);
  }

  @Test(expected = RuntimeException.class)
  public void test_case_01() {

    throw new RuntimeException();
  }
}
