package com.soumyadeep;

public class LargestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4, -3, -2, -1, -1, 4, 3, 2};
        System.out.println(maxAltitude(gain));
    }

    static int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude[i + 1] = altitude[i] + gain[i];
        }
        int maxAltitude = altitude[0];
        for (int i = 0; i < altitude.length; i++) {
            if (altitude[i] > maxAltitude)
                maxAltitude = altitude[i];
        }
        return maxAltitude;
    }

    static int maxAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            max = Math.max(current, max);
        }
        return max;
    }
}
