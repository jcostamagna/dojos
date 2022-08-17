package com.mercadolibre.dojos;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<String> findSecondLineProducts(ArrayList<Product> productArrayList) {
        HashMap<Integer, List<String>> inventary = new HashMap<>();

        productArrayList.stream().forEach(product -> {
            List<String> actualProducts = inventary.getOrDefault(product.getPrice(), new ArrayList<>());

            actualProducts.add(product.getName());

            inventary.put(product.getPrice(), actualProducts);
        });

        List<Integer> keys = inventary.keySet().stream().sorted().collect(Collectors.toList());


        Collections.reverse(keys);

        return inventary.get(keys.get(1));
    }
}
