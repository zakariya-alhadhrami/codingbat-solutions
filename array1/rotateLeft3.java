public int[] rotateLeft3(int[] nums) {
  
  int[] rotation = {0,0,0};
  
  rotation[0] = nums[1];
  rotation[1] = nums[2];
  rotation[2] = nums[0];
  
  
  return rotation;
  
  
}
