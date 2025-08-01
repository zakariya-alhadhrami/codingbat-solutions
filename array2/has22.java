public boolean has22(int[] nums) {
  if(nums.length <2){return false;}
  
  for(int i =0;i<nums.length;i++){
    if(i == nums.length - 1){return false;}
    
    if(nums[i] == 2 && nums[i+1] == 2){return true;}
    else{continue;}
  }
  
  return false;
  
  
}
