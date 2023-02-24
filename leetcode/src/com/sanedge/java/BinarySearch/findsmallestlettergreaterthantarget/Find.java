package com.sanedge.java.BinarySearch.findsmallestlettergreaterthantarget;

public class Find {
    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length - 1;

        while(low <= high){
            int mid = low + (high - low ) / 2;
            if(letters[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        char find = letters[low % letters.length];

        if(find <= target){
            return letters[0];
        }

        return find;
    }
}
