// https://leetcode.com/problems/merge-sorted-array/description/
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int indexOne = m-1;
    int indexTwo = n-1;

    // run two pointers from the last valid index, push larger elem to the end
    while(indexOne>=0 || indexTwo>=0){
      //when one of the pointers is negative
      if(indexOne<0){ // 4, 5, 6, 0, 0, 0  |  1, 2, 3
        nums1[indexOne+indexTwo+1] = nums2[indexTwo--];
        continue;
      } else if(indexTwo<0) break; // 1, 2, 3, 0, 0  |  4, 5, 6 indexTwo -ve would mean sorting is done

      // compare and swap
      if(nums2[indexTwo]>nums1[indexOne]){
        nums1[indexOne+indexTwo+1] = nums2[indexTwo--];
      } else {
        nums1[indexOne+indexTwo+1] = nums1[indexOne--];
      }
    }
  }
}
