public int[] frontPiece(int[] nums) {
  if(nums.length <= 2){return nums;}
  
  int[] Front2 = new int[2];
  
  Front2[0] = nums[0];
  Front2[1] =nums[1];
  
  return Front2;
}
