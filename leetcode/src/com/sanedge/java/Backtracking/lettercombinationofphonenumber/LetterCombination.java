package com.sanedge.java.Backtracking.lettercombinationofphonenumber;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    private static final String[] letterMap = new String[]{
        " ",    //0
        "",     //1
        "abc",  //2
        "def",  //3
        "ghi",  //4
        "jkl",  //5
        "mno",  //6
        "pqrs", //7
        "tuv",  //8
        "wxyz", //9
    };
    
    private static List<String> res = new ArrayList<>();

    public static List<String> letterCombinations(String digits){
        if(digits == null || digits.length() == 0){
            return new ArrayList<>();
        }
        res.clear();
        findCombination(digits, 0, "");
        return res;
    }

    private static void findCombination(String digits, int index, String s){
        if(index == digits.length()){
            res.add(s);
            return;
        }

        char num = digits.charAt(index);
        String letter = letterMap[num - '0'];
        for(int i = 0; i < letter.length(); i++){
            findCombination(digits, index+1, s + letter.charAt(i));
        }
    }
}
