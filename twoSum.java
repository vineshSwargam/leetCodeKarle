// https://leetcode.com/problems/two-sum/

import java.util.*;

class Solution {
  public int[] twoSum(int[] nums, int target) {
      return findTwoSum(nums, target);
  }

  public static int[] findTwoSum(int arr[], int target) {
    int size = arr.length;
    Hashtable<Integer, Integer> elemIndexMap = new Hashtable<Integer, Integer>();
    for(int i=0; i<size; i++){
      int secVal = target - arr[i];
      if (elemIndexMap.containsKey(secVal)) {
        return new int[] {elemIndexMap.get(secVal), i};
      } else {
        elemIndexMap.put(arr[i], i);
      }
    }
    return new int[] {};
  }
}
