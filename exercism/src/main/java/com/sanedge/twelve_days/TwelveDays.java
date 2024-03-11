package com.sanedge.twelve_days;

public class TwelveDays {
  private final String start = "On the %s day of Christmas my true love gave to me: ";
  private final String[] days = {
      "first",
      "second",
      "third",
      "fourth",
      "fifth",
      "sixth",
      "seventh",
      "eighth",
      "ninth",
      "tenth",
      "eleventh",
      "twelfth"
  };

  private final String[] gifts = {
      "a Partridge in a Pear Tree.\n",
      "two Turtle Doves, and ",
      "three French Hens, ",
      "four Calling Birds, ",
      "five Gold Rings, ",
      "six Geese-a-Laying, ",
      "seven Swans-a-Swimming, ",
      "eight Maids-a-Milking, ",
      "nine Ladies Dancing, ",
      "ten Lords-a-Leaping, ",
      "eleven Pipers Piping, ",
      "twelve Drummers Drumming, "
  };

  String verse(int verseNumber) {
    StringBuilder verse = new StringBuilder(String.format(start, days[verseNumber - 1]));

    for (int i = verseNumber - 1; i >= 0; i--)
      verse.append(gifts[i]);

    return verse.toString();
  }

  String verses(int startVerse, int endVerse) {
    if (startVerse == endVerse)
      return verse(startVerse);

    return verse(startVerse) + "\n" + verses(startVerse + 1, endVerse);
  }

  String sing() {
    return verses(1, 12);
  }
}
