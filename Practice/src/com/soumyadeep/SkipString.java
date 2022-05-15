package com.soumyadeep;

public class SkipString {
    public static void main(String[] args) {
        skipApple("","soumyadeep-has-a-apple-phone");
    }

    static void skipApple(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        if(up.startsWith("apple")){
            skipApple(p,up.substring(5));
        }else{
            skipApple(p+up.charAt(0),up.substring(1));
        }
    }


}
