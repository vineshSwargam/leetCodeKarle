//https://leetcode.com/problems/majority-element/description/

public int majorityElement(int[] nums) {
    Hashtable<Integer, Integer> elemCountMap = new Hashtable<Integer, Integer>();
    for(int num: nums){
      int count = elemCountMap.containsKey(num) ? elemCountMap.get(num)+1 : 1;
      if(count > nums.length/2){
        return num;
      }
      elemCountMap.put(num, count);
    }
    return nums[0];
  }
