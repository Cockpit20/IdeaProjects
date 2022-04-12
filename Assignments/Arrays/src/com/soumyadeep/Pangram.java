package com.soumyadeep;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "qklccnqeicrabxpggieplwjhakurwwhxbugbryvhazoofifidzvxczmpdjfcyiuhqyedxhzexvpitxknjogpetvgxeqrjuuxzzfblhmhbgibocbhtcbgyxzchlawvnhczlecsrioapggorouzcputqsxhvoxbqxxydiumxwg";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
        int c=0;
        for (char j = 97; j <= 122; j++) {
            for (int i = 0; i < sentence.length(); i++)
            {
                if(j==sentence.charAt(i)){
                    c++;
                    break;
                }
            }
        }
        return c == 26;
    }
}
