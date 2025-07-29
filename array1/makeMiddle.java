public int[] makeMiddle(int[] nums) {
  if(nums.length == 0){return nums;}
  if(nums.length == 2){return nums;}
  
  int[] mid = new int[2];
  
  int len = nums.length/2;
  
  mid[0] = nums[len-1];
  mid[1] = nums[len];
  
  return mid;
  
  
  
  
}
