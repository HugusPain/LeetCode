package com.Hugus.SimpleDemo;

/**
 * Copyright (C), 2021-2022, www.hugusPain.com
 *
 * @ClassName Palindrome
 * @Description check whether a palindrome
 * @Author hugus
 * @Date 2023/3/15 11:34
 * @Version V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * hugus         2023/3/15 11:34     V1.0           Initial class
 */
public class Palindrome {

    public static boolean isPalindrome(int x){
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(x));
        return Integer.toString(x).equals(stringBuilder.reverse().toString());
    }

    public static boolean isPalindrome2(int x){
        long originInt = (long)x;
        if(x < 0){
            return false;
        }else {
            long palindromeInt = 0L;
            while(x != 0){
                palindromeInt = palindromeInt * 10 + x % 10;
                x /= 10;
            }
            System.out.println("palindromeInt:"+palindromeInt);
            return palindromeInt == originInt;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2(123454321));
    }

}

