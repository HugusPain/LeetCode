package com.Hugus.SimpleDemo;

import java.util.*;

/**
 * Copyright (C), 2021-2022, www.hugusPain.com
 *
 * @ClassName ValidBrackets
 * @Description
 * 给定一个只包括 '(',')','{','}','[',']' 的字符串 s ,判断字符串是否有效.
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合.
 * 左括号必须以正确的顺序闭合.
 * 每个右括号都有一个对应的相同类型的左括号.
 * @Author hugus
 * @Date 2023/3/21 11:37
 * @Version V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * hugus         2023/3/21 11:37     V1.0           Initial class
 */
public class ValidBrackets {

    public static void main(String[] args) {
        boolean res = isValid("{((<[()()[][]{}{}{[]}]>))}");
        System.out.println(res);
    }
    /**
     * @Description //TODO 用栈的方式 来判断
     * @Author HugusPain
     * @Date 2023/3/22 16:23
     * @param s //..
     * @returnType boolean
    */
    public static boolean isValid(String s) {
//        return isValidBracket(s);
        int length = s.length();
        if (length == 0 || length %2 != 0) {
            return false;
        }
        Map<Character,Character> pairs = new HashMap<>(){
            {
                put('}','{');
                put(']','[');
                put(')','(');
                put('>','<');
            }
        };
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(pairs.containsKey(c)){
                if(stack.isEmpty() || stack.peek() != pairs.get(c)) {
                    return false;
                }
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();

    }

    /**
     * @Description //TODO 这个思路其实跟我的思路是一致的,只是我走进了死胡同,纠结在字符串的删除字符 和 递归算法里
     * @Author HugusPain
     * @Date 2023/3/22 14:51
     * @param s //..
     * @returnType boolean
    */
    private boolean isValidBracket(String s) {
        while (true){
            int length = s.length();
            s = s.replace("{}","").replace("[]","").replace("()","").replace("<>","");
            if(s.length() == length){
                return length == 0;
            }
        }
    }

    /**
     * @Description //TODO 还需要修改 没有达到我所预期的效果 另外代码也应该可以优化
     * @Author HugusPain
     * @Date 2023/3/22 14:31
     * @param s //括号字符串
     * @returnType java.lang.String
    */
    private static String removeValidBrackets(String s) {
        String before,after;
        int count = 0;
        if(Objects.equals(s, "")) return "";
        System.out.println("最后的(下标为:" + s.lastIndexOf('(') + " 之后第一个)是" + s.indexOf(')',s.lastIndexOf('(')) + ",最后的[下标为:" + s.lastIndexOf('[') + " 之后第一个]是"+ s.indexOf(']',s.lastIndexOf('[')) + ",最后的{下标为:" + s.lastIndexOf('{') + " 之后第一个}是"+s.indexOf('}',s.lastIndexOf('{')));
        if(s.lastIndexOf('(') != -1 && s.indexOf(')',s.lastIndexOf('(')) != -1 && s.lastIndexOf('(') + 1 == s.indexOf(')',s.lastIndexOf('('))){
            before = s.substring(0,s.lastIndexOf('('));
            after = s.substring(s.lastIndexOf('(')+2);
            s = before + after;
            count++;
            System.out.println("Str after remove () valid:"+s);

        }
        if(s.lastIndexOf('[') != -1 && s.indexOf(']',s.lastIndexOf('[')) != -1 && s.lastIndexOf('[') + 1 == s.indexOf(']',s.lastIndexOf('['))){
            before = s.substring(0,s.lastIndexOf('['));
            after = s.substring(s.lastIndexOf('[')+2);
            s = before + after;
            count++;
            System.out.println("Str after remove [] valid:"+s);
        }
        if(s.lastIndexOf('{') != -1 && s.indexOf('}',s.lastIndexOf('{')) != -1 && s.lastIndexOf('{') + 1 == s.indexOf('}',s.lastIndexOf('{'))){
            before = s.substring(0,s.lastIndexOf('{'));
            after = s.substring(s.lastIndexOf('{')+2);
            s = before + after;
            count++;
            System.out.println("Str after remove {} valid:"+s);
        }
        if(count == 0) {
            System.out.println("No match already,the last str:"+s);
            return s;
        }else{
            System.out.println("Str after remove valid:"+s);
            return removeValidBrackets(s);
        }
    }

}

