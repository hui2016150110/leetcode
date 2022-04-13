package com.example.leetcode.twopoints

/**
 * https://leetcode-cn.com/problems/remove-element/
 */
fun removeElement(nums: IntArray, `val`: Int): Int {
    var result = 0
    for(value  in nums){
        if (value !=`val`){
            nums[result] = value
            result++
        }
    }
    return result
}