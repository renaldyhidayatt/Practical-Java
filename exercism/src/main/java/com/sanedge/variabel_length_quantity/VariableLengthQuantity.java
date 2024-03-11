package com.sanedge.variabel_length_quantity;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class VariableLengthQuantity {
  private static final String HEX_FORMAT = "0x%x";
  private static final long FIRST_7BITS_MASK = 0x7Fl;
  private static final long UP_BIT8_MASK = 0x80l;
  private static final int SHIFT_7BITS = 7;
  private static final int MAX_SHIFTED = Long.SIZE / SHIFT_7BITS;
  private static final String WRONG_VLQ_ENCODING = "Invalid variable-length quantity encoding";

  private List<String> encode(Long toEncode) {
    var encoded = new LinkedList<String>();

    for (int i = 0; i < MAX_SHIFTED; i++) {
      long first7Bits = toEncode & FIRST_7BITS_MASK;

      toEncode = toEncode >> SHIFT_7BITS;

      if (toEncode == 0 && first7Bits == 0)
        break;

      if (i != 0)
        first7Bits |= UP_BIT8_MASK;

      String hex = String.format(HEX_FORMAT, first7Bits);
      encoded.addFirst(hex);
    }

    return encoded;
  }

  List<String> encode(List<Long> numbers) {
    return numbers.stream()
        .filter(Objects::nonNull)
        .flatMap(this::encode)
        .collect(Collectors.toList());
  }

  List<Long> decode(List<String> bytes) {
    var numbers = new LinkedList<Long>();
    long value = 0L;

    for (String byteStr : bytes) {
      long byteValue = Long.parseLong(byteStr.substring(2), 16);

      value = (value << SHIFT_7BITS) | (byteValue & FIRST_7BITS_MASK);

      if ((byteValue & UP_BIT8_MASK) != UP_BIT8_MASK) {
        numbers.add(value);
        value = 0L;
      }
    }

    if (value != 0L)
      throw new IllegalArgumentException(WRONG_VLQ_ENCODING);

    return numbers;
  }
}
