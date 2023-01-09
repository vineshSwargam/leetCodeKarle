// https://leetcode.com/problems/move-zeroes/description/

public void moveZeroes(int[] nums) {
      int lastPosInd = 0;

      for(int i=0; i<nums.length; i++){
        if(nums[i]!=0){                // 0 1 0 2
          int temp = nums[i];          // x 1 
          nums[i] = nums[lastPosInd];  // x 0
          nums[lastPosInd] = temp;     // x 1
          lastPosInd++;                // 0 1
        }
      }

      //brute O(2n)
      
      // int size = nums.length;
      // int lastZeroIndex = nums[size-1];
      // int posAndNegArr[] = new int[size];
      // int posAndNegArrIndex = 0;
      // for(int i=0; i<size; i++){
      //   if(nums[i]!=0){
      //     posAndNegArr[posAndNegArrIndex] = nums[i];
      //     posAndNegArrIndex++;
      //   }
      // }
      // for(int i=0; i<size; i++){
      //   if(i<posAndNegArrIndex){
      //     nums[i] = posAndNegArr[i];
      //   } else{
      //     nums[i] = 0;
      //   }
      // }

    }
