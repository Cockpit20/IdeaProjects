package com.soumyadeep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies={12,1,12};
        System.out.println(Arrays.toString(candies));
        int extraCandies=10;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        //Calculate the maximum candies
        int maxCandies=candies[0];
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>maxCandies)
                maxCandies=candies[i];
        }
        //Add the extra candies and compare
        for (int i = 0; i < candies.length; i++) {
            int totalCandies=extraCandies+candies[i];
            if(totalCandies>=maxCandies)
                ans.add(true);
            else ans.add(false);
        }
        return ans;
    }


}
