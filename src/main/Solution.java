package main;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,1};
        if (array.length == 1) {
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                Integer temp = map.get(array[i]);
                map.replace(array[i], ++temp);
            } else {
                map.put(array[i], 1);
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        if (entries.size() > 1 && entries.get(0).getValue() == entries.get(1).getValue()) {
            System.out.println(-1);
        } else {
            System.out.println(entries.get(0).getKey());
        }

    }
}
