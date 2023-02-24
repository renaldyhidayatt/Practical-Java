package com.sanedge.java.BinarySearch.timebased;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Time {
    private Map<String, List<Data>> map;

    public Time() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Data(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        List<Data> data = map.get(key);
        int i = Collections.binarySearch(data, new Data(timestamp, ""), new Comparator<Data>() {
            @Override
            public int compare(Data d1, Data d2) {
                return Integer.compare(d1.time, d2.time);
            }
        });
        if (i >= 0) {
            return data.get(i).value;
        } else if (-i - 1 == 0) {
            return "";
        } else {
            return data.get(-i - 2).value;
        }
    }

    private static class Data {
        public int time;
        public String value;

        public Data(int time, String value) {
            this.time = time;
            this.value = value;
        }
    }
}
