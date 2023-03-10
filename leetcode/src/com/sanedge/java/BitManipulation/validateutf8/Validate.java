package com.sanedge.java.BitManipulation.validateutf8;

public class Validate {
    public static boolean validUtf8(int[] data){
        int count = 0;

        for(int d : data){
            if(count == 0){
                if(d >= 248){
                    return false;
                }else if (d >= 240){
                    count = 3;
                }else if (d >= 224){
                    count = 2;
                }else if(d >= 192){
                    count = 1;
                }else if(d > 127){
                    return false;
                }
            }else{
                if(d <= 127 || d >= 192){
                    return false;
                }

                count--;
            }
        }

        return count == 0;
    }
}
