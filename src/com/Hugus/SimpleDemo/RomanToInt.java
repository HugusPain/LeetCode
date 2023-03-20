package com.Hugus.SimpleDemo;

import com.sun.source.tree.CaseTree;

/**
 * Copyright (C), 2021-2022, www.hugusPain.com
 *
 * @ClassName RomanToInt
 * @Description convert the roman string to int
 * 罗马数字包含以下七种字符: I, V, X, L,C,D 和 M.
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如, 罗马数字 2 写做 II ,即为两个并列的 1 .12 写做 XII ,即为 X + II . 27 写做  XXVII, 即为 XX + V + II .
 * 通常情况下,罗马数字中小的数字在大的数字的右边.但也存在特例,例如 4 不写做 IIII,而是 IV.数字 1 在数字 5 的左边,所表示的数等于大数 5 减小数 1 得到的数值 4 .
 * 同样地,数字 9 表示为 IX.这个特殊的规则只适用于以下六种情况：
 * I 可以放在 V (5) 和 X (10) 的左边,来表示 4 和 9.
 * X 可以放在 L (50) 和 C (100) 的左边,来表示 40 和 90. 
 * C 可以放在 D (500) 和 M (1000) 的左边,来表示 400 和 900.
 * 给定一个罗马数字,将其转换成整数
 * @Author hugus
 * @Date 2023/3/16 11:49
 * @Version V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * hugus         2023/3/16 11:49     V1.0           Initial class
 */
public class RomanToInt {
    public static void main(String[] args) {
        String romanStr = "XXXVII";
        int romToNum = revertRomToNum(romanStr);
        System.out.println(romToNum);

    }

    private static int revertRomToNum(String s) {
        int res = 0;
        switch (s){
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
        }


            s = s.replace("IV","IIII")
                    .replace("IX","VIIII")
                    .replace("XL","XXXX")
                    .replace("XC","LXXXX")
                    .replace("CD","CCCC")
                    .replace("CM","DCCCC");


            for (int i = 0; i < s.length(); i++) {
                if('M' == (s.charAt(i))){
                    res += 1000;
                }else if('D' == (s.charAt(i))){
                    res += 500;
                }else if('C' == (s.charAt(i))){
                    res += 100;
                }else if('L' == (s.charAt(i))){
                    res += 50;
                }else if('X' == (s.charAt(i))){
                    res += 10;
                }else if('V' == (s.charAt(i))){
                    res += 5;
                }else if ('I' == (s.charAt(i))){
                    res += 1;
                }
            }
        return res;
    }
}

