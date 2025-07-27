public int[] makeEnds(int[] nums) {
  int[] ends = {0,0};
  
  if(nums.length == 1){
    ends[0] = nums[0];
    ends[1] = nums[0];
    return ends;
  }
  
  else{
    ends[0] = nums[0];
    ends[1] = nums[nums.length-1];
    
    return ends;
  }
}
