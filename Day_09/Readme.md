# Convert 1D Array Into 2D Array

Problem link: [Convert 1D Array Into 2D Array - LeetCode](https://leetcode.com/problems/convert-1d-array-into-2d-array/description/)

## Problem Description

You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n. Your task is to convert the array into a 2-dimensional (2D) array with m rows and n columns.

The 2D array should be constructed such that arr[i][j] == original[i * n + j] where 0 <= i < m and 0 <= j < n.

Return the newly constructed 2D array.

If it is impossible to satisfy the above constraints, return an empty 2D array.

## Example

Input: `original = [1,2,3,4]`, `m = 2`, `n = 2`  
Output: `[[1,2],[3,4]]`

Explanation:  
The newly constructed 2D array is:  
1 2  
3 4

Input: `original = [1,2,3]`, `m = 1`, `n = 3`  
Output: `[[1,2,3]]`

Explanation:  
The newly constructed 2D array is:  
1 2 3
