package com.example.leetcode.twopoints

/**
 * error
 * https://leetcode-cn.com/problems/sort-colors/
 */
fun sortColors(nums: IntArray): Unit {
    var head = 0
    var tail = nums.size - 1
    var index = 0
    for (num in nums) {
        if (num == 0) {
            nums[index] = nums[head]
            nums[head] = 0
            head++
        }else if (num == 2){
            nums[index] = nums[tail]
            nums[tail] = 2
            tail--
            if (nums[index]<nums[head]){
                val temp = nums[index]
                nums[index] = nums[head]
                nums[head] = temp
                head++
            }
        }
        if (index==tail){
            break
        }

    }
}

fun main(){
    val intArray = intArrayOf(2,0,2,1,1,0)
    sortColors(intArray)
}