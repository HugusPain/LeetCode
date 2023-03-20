package com.Hugus.SimpleDemo;

import java.util.Arrays;
import java.util.List;

/**
 * Copyright (C), 2021-2022, www.hugusPain.com
 *
 * @ClassName CommonPrefixDemo
 * @Description calculate the longest prefix
 * @Author hugus
 * @Date 2023/3/20 11:13
 * @Version V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * hugus         2023/3/20 11:13     V1.0           Initial class
 */
public class CommonPrefixDemo {
    /*public static String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        String shortest = strs[0];
        boolean allStartWith = true;
        int index = 0;
        for (String str : strs) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        System.out.println("the shortest:"+shortest);
        for (int i = 0; i < shortest.length(); i++) {
            for (String str:strs) {
                if(!str.startsWith(shortest.substring(0,i+1))) {
                    allStartWith = false;
                    break;
                }
            }
            if(allStartWith){
                index++;
            }
        }
        if(index == 0){
            commonPrefix = "";
        }else if(index < shortest.length()){
            commonPrefix = shortest.substring(0,index);
        }else {
            commonPrefix = shortest;
        }
        return commonPrefix;
    }*/
    public static String longestCommonPrefix(String[] strs) {
        boolean allMatch = true;
        int longestIndex = 0;
        if(strs.length == 1){
            return strs[0];
        }
        for (int i = 1; i <= strs[0].length(); i++) {
            for (String str:strs) {
                if(!str.startsWith(strs[0].substring(0,i))){
                    allMatch = false;
                    break;
                }
            }
            if (allMatch) {
                longestIndex++;
            }
        }
        return strs[0].substring(0,longestIndex);
    }

    public static void main(String[] args) {
        String[] strings = {"flow","flow","flow","flow"};
        String s = longestCommonPrefix(strings);
        System.out.println(s);
//        System.out.println("flow".substring(0,4));
    }
}

