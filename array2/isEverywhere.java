public boolean isEverywhere(int[] nums, int val) {
  
  boolean check = true;
  
  for(int i = 0;i<nums.length-1;i++){
    
    if(nums[i]==val || nums[i+1] == val ){continue;}
    else{check = false; break;}
    
    
  }
  
  return check;
  
}
