package com.sanedge.java.BinarySearch.kthsmallestnumber;

public class Kth {
    public static int findKthNumber(int m, int n, int k){
        int low = 1, high = m * n;

        while(low < high){
            int mid = low + (high - low )/ 2;
            int count = counterKthNum(m, n, mid);

            if(count >= k){
                high = mid;
                
            }else{
                low = mid + 1;
            }
        }

        return low;
        
    }

    public  static int counterKthNum(int m, int n , int mid){
        int count = 0;
        for(int i = 1; i <= m; i++){
            count += Math.min(Math.floor(mid / i), n);
        }

        return count;
    }
}
