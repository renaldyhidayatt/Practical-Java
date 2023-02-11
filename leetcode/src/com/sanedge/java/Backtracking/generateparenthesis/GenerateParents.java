package com.sanedge.java.Backtracking.generateparenthesis;

import java.util.ArrayList;
import java.util.List;

public class GenerateParents{
    private static List<String> res = new ArrayList<>();

    public static List<String> generateParenthesis(int n){
        if(n == 0){
            return new ArrayList<>();
        }
        res.clear();
        findGenerateParenthesis(n, n, "", res);
        return res;
    }

    private static void findGenerateParenthesis(int lindex, int rindex, String str, List<String> res){
        if (lindex == 0 && rindex == 0) {
            res.add(str);
            return;
        }
        if (lindex > 0) {
            findGenerateParenthesis(lindex - 1, rindex, str + "(", res);
        }
        if (rindex > 0 && lindex < rindex) {
            findGenerateParenthesis(lindex, rindex - 1, str + ")", res);
        }
    }
}