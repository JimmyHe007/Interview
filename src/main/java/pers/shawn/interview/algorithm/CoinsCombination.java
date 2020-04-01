package pers.shawn.interview.algorithm;

import java.util.*;

public class CoinsCombination {

    public static void main(String[] args) {

        int[] coins = {10, 50, 100};
        int[] counts = {1, 2, 1};
        countDistinctSum(coins, counts);
    }

    public static Integer countDistinctSum(int[] coins, int[] counts) {
        if (coins.length != counts.length) {
            return -1;
        }
        List coinsList = new ArrayList();
        //把硬币和数量结合放入一个新数组
        for (int i=0;i<coins.length;i++) {
            for (int j=0;j<counts[i];j++) {
                coinsList.add(coins[i]);
            }
        }
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < coinsList.size(); i++) {
            int[] tempSum;
            for (int j = 0; j < result.size(); j++) {
                
            }
        }
        coinsList.forEach(coin -> System.out.println(coin));
        return 1;
    }

}
