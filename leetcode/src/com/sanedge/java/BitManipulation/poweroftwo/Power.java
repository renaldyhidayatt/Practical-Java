package com.sanedge.java.BitManipulation.poweroftwo;

public class Power {
    public static boolean isPowerOfTwo3(int num){
        while(num >= 2){
            if(num %2 == 0){
                num = num / 2;
            }else{
                return false;
            }
        }

        return num == 1;
    }
}
