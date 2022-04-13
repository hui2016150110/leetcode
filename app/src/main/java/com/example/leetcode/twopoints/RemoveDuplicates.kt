package com.example.leetcode.twopoints

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
fun removeDuplicates(nums: IntArray): Int {
    var next = 0
    for (value in nums){
        if (nums[next]==value){
            continue
        }else{
            nums[++next] = value
        }
    }
    return next+1
}