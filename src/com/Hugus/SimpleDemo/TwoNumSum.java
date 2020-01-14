/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TwoNumSum
 * Author:   Administrator
 * Date:     2020/1/14 0014 12:17
 * Description: 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。  你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素.
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.Hugus.SimpleDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *〈BriefDescription〉                                                                                    
 * 〈给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *  你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素.〉
 *
 * @author Administrator
 * @create 2020/1/14 0014                                                                                        
 * @since 1.0.0
 */
public class TwoNumSum {
    public static void main(String[] args) {
        int []nums = new int[]{0,1,5,9,8,6,3,4};
        int target = 10;
        Map<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                System.out.println(map.get(complement)+","+i);
            }
            map.put(nums[i],i);
        }
    }
}