public int[] makeLast(int[] nums) {
  
  int len = nums.length * 2;
  
  int[] ml = new int[len];
  
  
  ml[len-1] = nums[nums.length - 1];
  
  return ml;
  
}
