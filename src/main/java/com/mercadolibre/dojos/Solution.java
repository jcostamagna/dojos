package com.mercadolibre.dojos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Solution {
    public Map<Long, Long> count(Map<String, UserStats>... visits) {
        Map<Long, Long> result = new HashMap<>();

        if(visits == null) {
            return result;
        }

        Arrays.stream(visits).forEach(visitMap -> {
            if(visitMap != null) {
                for (Map.Entry<String, UserStats> set : visitMap.entrySet()) {
                    if (!isNumeric(set.getKey())) {
                        continue;
                    }

                    Long key = Long.valueOf(set.getKey());

                    Optional<Long> value = Optional.ofNullable(set.getValue()).map(userStat -> userStat.getVisitCount().orElse(null));

                    value.ifPresent(valuePresent -> result.put(key, result.getOrDefault(key, 0L) + valuePresent));
                }
            }
        });

        return result;
    }

    public boolean isNumeric(String str) {
        try {
            Long.valueOf(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
