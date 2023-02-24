package com.sanedge.java.BinarySearch.selldiminishing;

public class Sell {
    public static int maxProfit(int[] inventory, int orders){
        int maxItem = 0, thresholdValue = -1, count = 0, res = 0, mod = 1000000007;

        for(int i = 0; i < inventory.length; i++){
            if(inventory[i] > maxItem){
                maxItem = inventory[i];
            }
        }

        int low = 0, high = maxItem;

        while(low <= high){
            int mid = low + ((high - low) >> 1);
            for (int i = 0; i < inventory.length; i++) {
                count += Math.max(inventory[i]-mid, 0);
            }
        
            if (count <= orders) {
                thresholdValue = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            count = 0;
        }

        count = 0;
        for(int i = 0; i < inventory.length;i++){
            count += Math.max(inventory[i]-thresholdValue, 0);
        }

        count = orders  - count;

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] >= thresholdValue) {
                if (count > 0) {
                    res += (thresholdValue + inventory[i]) * (inventory[i] - thresholdValue + 1) / 2;
                    count--;
                } else {
                    res += (thresholdValue + 1 + inventory[i]) * (inventory[i] - thresholdValue) / 2;
                }
            }
        }
        
        return res % mod;
        
    }
}
