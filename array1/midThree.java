public int[] midThree(int[] nums) {
  if(nums.length == 3){return nums;}
  
  int[] mid = new int[3];
  
  int len = nums.length/2;
  
  mid[0] = nums[len-1];
  mid[1] = nums[len];
  mid[2] = nums[len+1];
  
  return mid;
  
}
