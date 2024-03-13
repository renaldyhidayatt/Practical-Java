package com.sanedge.pig_latin;

public class PigLatinTranslator {

  public String translate(String string) {
    String[] strArr = string.split(" ");

    if (strArr.length < 2) {
      if (startwithVowel(string)) {
        string = appendVal(string, "ay");
      } else {
        if ((string.charAt(0) == 'q' && string.charAt(1) == 'u')) {
          string = addChartoEnd(string);
          string = addChartoEnd(string);
          string = translate(string);
        } else if ((string.charAt(1) == 'q' && string.charAt(2) == 'u')) {
          string = addChartoEnd(string);
          string = addChartoEnd(string);
          string = addChartoEnd(string);
          string = translate(string);
        } else if ((string.charAt(1) == 'y' && string.length() == 2)) {
          string = addChartoEnd(string);
          string = appendVal(string, "ay");
        } else {
          string = addChartoEnd(string);
          string = translate(string);
        }
      }
    } else {
      String[] modStrArr = translateStrArr(strArr);
      string = modStrArr[0];

      for (int i = 1; i < modStrArr.length; i++) {
        string = string + " " + modStrArr[i];
      }
    }

    return string;
  }

  public String[] translateStrArr(String[] strArr) {
    for (int i = 0; i < strArr.length; i++) {
      strArr[i] = translate(strArr[i]);
    }

    return strArr;
  }

  public String appendVal(String inp, String suff) {
    StringBuilder sb = new StringBuilder(inp);
    sb.append(suff);

    return sb.toString();
  }

  public boolean startwithVowel(String string) {
    if (isCharVowel(string.charAt(0))) {
      return true;
    } else if ((string.charAt(0) == 'x' && string.charAt(1) == 'r')
        || (string.charAt(0) == 'y' && string.charAt(1) == 't')) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isCharVowel(char ch) {
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      return true;
    } else {
      return false;
    }
  }

  public String addChartoEnd(String str) {
    char[] charArr = str.toCharArray();
    char[] charModArr = str.toCharArray();

    String updStr = "";

    for (int i = 0; i < charArr.length; i++) {
      if (i < charArr.length - 1) {
        charArr[i] = charArr[i + 1];

      } else {
        charArr[i] = charModArr[0];
      }
    }
    updStr = String.valueOf(charArr);

    return updStr;
  }
}
