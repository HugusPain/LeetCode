/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: IntegerReverse
 * Author:   Administrator
 * Date:     2020/1/15 0015 13:37
 * Description: 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.Hugus.SimpleDemo;

/**
 *〈BriefDescription〉                                                                                    
 * 〈给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。〉                                                                                                                                                               
 *
 * @author Administrator
 * @create 2020/1/15 0015                                                                                        
 * @since 1.0.0
 */
public class IntegerReverse {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("max:"+max);
        System.out.println("min:"+min);
        int a = -2147483412;
        int res = reverse2(a);
        System.out.println(res);
    }
    /*
     * @Description //这个方法其实是取巧的 跟算法无关了 而且一旦出现负数 就会出错
     * @Author HugusPain
     * @Date 2023/3/14 11:57
     * @param num
     * @returnType int
    */
    private static int rev(int num){
        String numStr = String.valueOf(num);
        System.out.println("The numStr:"+numStr);
        StringBuilder builder = new StringBuilder(numStr);
        String res = builder.reverse().toString();
        System.out.println("The result Str:"+res);
        return Integer.parseInt(res);
    }

    /*
     * @Description
     * 原数取余10,得到个位数 个位数*10 得到新的res 原数取模10得到新的res
     *
     * @Author HugusPain
     * @Date 2023/3/14 12:03
     * @param x
     * @returnType int
    */
    private static int reverse(int x){
        int res = 0;
        while(x != 0){
            res = x%10 + res*10;
            x /= 10;
            if (res > Integer.MAX_VALUE / 10 ||(res == Integer.MAX_VALUE/10 && x > 7)) return 0;
            if (res < Integer.MIN_VALUE / 10 ||(res == Integer.MIN_VALUE/10 && x < -8)) return 0;
        }
        return res;
    }





    /*public static int reverse(int x){
        int rev = 0;
        int pop;
        while (x != 0){
            pop = x%10 ;
            x = x / 10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && x > 7))return 0;
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && x < -8))return 0;
            rev = rev*10+pop;
        }

        return rev;
    }*/

    /*public static int reverse(int x){
        int rev = 0;
        while (x != 0){
            rev = rev*10+x%10;
            x = x / 10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && x > 7))return 0;
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && x < -8))return 0;
        }

        return rev;
    }*/


    public static int reverse2(int x) {
        int res = 0;
        while(x != 0){
            res = x%10 + res*10;
            x /= 10;
            if(res > Integer.MAX_VALUE /10 || (res == Integer.MAX_VALUE/10 && x > 7)) return 0;
            if(res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE/10 && x < -8)) return 0;
        }
        return res;
    }

}