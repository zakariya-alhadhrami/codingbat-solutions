public int[] swapEnds(int[] nums) {
  if(nums.length == 1){return nums;}
  
  int store = nums[0];
  
  nums[0] = nums[nums.length - 1];
  nums[nums.length - 1] = store;
  
  return nums;
}
