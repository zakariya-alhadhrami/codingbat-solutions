public boolean has12(int[] nums) {
  
  for(int i = 0;i<nums.length;i++){
    
    if(nums[i] == 1){
      if(check(i,nums)){return true;}
    }
    
  }
  
  return false;
  
}

public boolean check(int index, int[] nums){
  
  for(int i = index+1; i<nums.length ;i++){
    
    if(nums[i] == 2){return true;}
    
    
  }
  
  return false;
  
}
