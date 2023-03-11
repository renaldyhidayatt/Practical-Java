package com.sanedge.java.BitManipulation.shoppingoffers;

import java.util.List;

public class Shopping {

    public static int shoppingOffers(int[] price, List<List<Integer>> special, int[] needs) {
        int[] res = new int[] { Integer.MAX_VALUE };

        dfsShoppingOffers(price, special, needs, 0, res);
        return res[0];
    }

    private static void dfsShoppingOffers(int[] price, List<List<Integer>> special, int[] needs, int pay, int[] res) {
        boolean noNeeds = true;
        for (int need : needs) {
            if (need < 0) {
                return;
            }
            if (need != 0) {
                noNeeds = false;
            }
        }
        if (special.size() == 0 || noNeeds) {
            for (int i = 0; i < price.length; i++) {
                pay += (price[i] * needs[i]);
            }
            res[0] = Math.min(res[0], pay);
            return;
        }
        List<Integer> currentSpecial = special.get(0);
        int[] newNeeds = new int[needs.length];
        for (int i = 0; i < needs.length; i++) {
            newNeeds[i] = needs[i] - currentSpecial.get(i);
        }
        dfsShoppingOffers(price, special, newNeeds, pay + currentSpecial.get(price.length), res);
        special.remove(0);
        dfsShoppingOffers(price, special, newNeeds, pay + currentSpecial.get(price.length), res);
        special.add(0, currentSpecial);
        dfsShoppingOffers(price, special.subList(1, special.size()), needs, pay, res);
    }
}
