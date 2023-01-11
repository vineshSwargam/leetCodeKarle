import java.util.*;

class Solution {
  public int majorityElement(int[] nums) {
    Hashtable<Integer, Integer> elemCountMap = new Hashtable<Integer, Integer>();
    int maxElement = nums[0];
    int maxCount = 0;
    for(int i=0; i<nums.length; i++){
      if(elemCountMap.containsKey(nums[i])){
        int count = elemCountMap.get(nums[i]) + 1;
        elemCountMap.put(nums[i], count);
        if(count > maxCount){
          maxCount=count;
          maxElement=nums[i];
        }
      } else {
        elemCountMap.put(nums[i], 1);
      }
    }
    return maxElement;
  }
}
