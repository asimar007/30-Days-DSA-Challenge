# Find Smallest Letter Greater Than Target

Problem link: [Find Smallest Letter Greater Than Target - LeetCode](https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/)

## Problem Description

Given a sorted array of lowercase letters sorted in non-decreasing order and a target letter target, return the smallest element in the array that is larger than the given target.

Note that the letters wrap around. For example, if the target is target = 'z' and the letters are letters = ['a', 'b'], the answer is 'a'.

## Example

Input: `letters = ["c", "f", "j"], target = "a"`  
Output: `"c"`

Input: `letters = ["c", "f", "j"], target = "c"`  
Output: `"f"`

Input: `letters = ["c", "f", "j"], target = "d"`  
Output: `"f"`

Input: `letters = ["c", "f", "j"], target = "g"`  
Output: `"j"`

Input: `letters = ["c", "f", "j"], target = "j"`  
Output: `"c"`

Input: `letters = ["c", "f", "j"], target = "k"`  
Output: `"c"`
