public int[] reverse3(int[] nums) {
  int[] reverse = {0,0,0};
  
  reverse[0] = nums[2];
  reverse[1] = nums[1];
  reverse[2] = nums[0];
  
  return reverse;
}
