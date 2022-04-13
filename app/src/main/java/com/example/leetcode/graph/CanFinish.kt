package com.example.leetcode.graph

import java.util.*
import kotlin.collections.ArrayList

//https://leetcode-cn.com/problems/course-schedule/
private lateinit var mAdj: ArrayList<LinkedList<Int>>
private lateinit var marked: BooleanArray
private lateinit var onStack: BooleanArray
private var result = true
fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
    mAdj = ArrayList(numCourses)
    marked = BooleanArray(numCourses){false}
    onStack = BooleanArray(numCourses){false}
    for (i in 0 until numCourses){
        mAdj.add(LinkedList())
    }
    for (value in prerequisites){
        mAdj[value[1]].add(value[0])
    }
    for (i in 0 until numCourses){
        if (!marked[i]&& result){
            dfs(i)
        }
    }
    return result
}

fun dfs(v:Int){
    onStack[v] = true
    marked[v] = true
    for (w in mAdj[v]) {
        if (!marked[w]) {
            dfs(w)
            if (!result){
                return
            }
        }else if(onStack[w]){
            result = false
            return
        }
    }
    onStack[v] = false
}