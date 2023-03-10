package com.sanedge.java.BitManipulation.integerreplacement;

public class Replace {
    public static int integerReplacement(int n){
        int res = 0;
        while(n > 1){
            if((n & 1) == 0){
                n >>= 1;
            }else if((n+ 1) %4 == 0 && n != 3){
                n++;
            }else{
                n--;
            }
            res++;
        }

        return res;
    }
}
