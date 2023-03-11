package com.sanedge.java.BitManipulation.pyramid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pyramid {

    public static boolean pyramidTransition(String bottom, List<String> allowed) {
        Map<String, List<String>> pyramid = new HashMap<>();
        for (String v : allowed) {
            String key = v.substring(0, v.length() - 1);
            String val = v.substring(v.length() - 1);
            pyramid.putIfAbsent(key, new ArrayList<>());
            pyramid.get(key).add(val);
        }
        return dfsT(bottom, "", pyramid);
    }

    public static boolean dfsT(String bottom, String above, Map<String, List<String>> pyramid) {
        if (bottom.length() == 2 && above.length() == 1) {
            return true;
        }
        if (bottom.length() == above.length() + 1) {
            return dfsT(above, "", pyramid);
        }
        String base = bottom.substring(above.length(), above.length() + 2);
        if (pyramid.containsKey(base)) {
            for (String key : pyramid.get(base)) {
                if (dfsT(bottom, above + key, pyramid)) {
                    return true;
                }
            }
        }
        return false;
    }
}
