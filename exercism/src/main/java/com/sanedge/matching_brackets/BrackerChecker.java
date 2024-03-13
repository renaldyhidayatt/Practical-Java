package com.sanedge.matching_brackets;

import java.util.Stack;

public class BrackerChecker {
  private String brackets;

  public BrackerChecker(String brackets) {
    this.brackets = brackets.replaceAll("[\\w\\s\\\\&^.+*-/]", "");
  }

  public boolean areBracketsMatchedAndNestedCorrectly() {
    Stack<Character> stack = new Stack<>();

    for (char c : brackets.toCharArray()) {
      if (c == '(')
        stack.push(')');
      else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');
      else if (stack.isEmpty() || stack.pop() != c)
        return false;
    }

    return stack.isEmpty();
  }
}
