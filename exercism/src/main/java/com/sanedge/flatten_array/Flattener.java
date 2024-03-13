package com.sanedge.flatten_array;

import java.util.ArrayList;
import java.util.List;

public class Flattener {

  List<Object> out = new ArrayList<>();

  List<Object> flatten(List<Object> list) {
    for (Object l : list) {
      if (l instanceof List)
        flatten((List<Object>) l);
      else if (l != null)
        out.add(l);
    }

    return out;
  }
}
