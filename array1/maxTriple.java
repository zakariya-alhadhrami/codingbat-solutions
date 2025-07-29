public int maxTriple(int[] nums) {
  int max = 0;
  
  if(nums[0] > nums[nums.length/2] && nums[0] > nums[nums.length - 1]){return nums[0];}
  
  if(nums[nums.length - 1] > nums[nums.length/2] && nums[nums.length - 1] > nums[0]){return nums[nums.length - 1];}
  
  else{return nums[nums.length/2];}
  
  
}
