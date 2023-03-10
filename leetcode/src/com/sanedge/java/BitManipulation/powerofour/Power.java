package com.sanedge.java.BitManipulation.powerofour;

public class Power {
    public static boolean isPowerOfFour(int num){
        while(num >= 4){
            if( num % 4 == 0){
                num = num / 4;
            }else{
                return false;
            }
        }

        return num == 1;
    }
}
