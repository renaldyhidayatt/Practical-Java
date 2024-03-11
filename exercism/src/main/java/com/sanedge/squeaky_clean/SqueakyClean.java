package com.sanedge.squeaky_clean;

public class SqueakyClean {
  public static String clean(String identifier) {
    StringBuilder cleanedIdentifier = new StringBuilder();

    for (int i = 0; i < identifier.length(); i++) {
      char c = identifier.charAt(i);

      c = leetSpeakToNormal(c);

      if (Character.isWhitespace(c)) {
        cleanedIdentifier.append('_');
      } else if (c == '-') {
        if (i + 1 < identifier.length()) {
          i++;

          c = Character.toUpperCase(identifier.charAt(i));

          cleanedIdentifier.append(c);
        }
      } else if (Character.isLetter(c)) {
        cleanedIdentifier.append(c);
      }
    }

    return cleanedIdentifier.toString();
  }

  private static char leetSpeakToNormal(char c) {
    switch (c) {
      case '3':
        return 'e';
      case '4':
        return 'a';
      case '1':
        return 'l';
      case '0':
        return 'o';
      case '7':
        return 't';
      default:
        return c;
    }
  }

}
