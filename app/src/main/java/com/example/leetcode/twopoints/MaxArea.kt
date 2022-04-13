package com.example.leetcode.twopoints

/**
 * https://leetcode-cn.com/problems/container-with-most-water/
 */
fun maxArea(height: IntArray): Int {
    var area = 0
    var left = 0
    var right = height.size-1
    while (left<right){
        var tempArea = 0
        if (height[left]<height[right]){
            tempArea = height[left]*(right-left)
            left++
        }else{
            tempArea = height[right]*(right-left)
            right--
        }
        if (tempArea>area){
            area = tempArea
        }
    }
    return area
}