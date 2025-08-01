public boolean has77(int[] nums) {
  
  boolean yes = false;
  
  for(int i = 0;i<nums.length-1;i++){
    
    if(nums[i]==7){
      if(nums[i+1] == 7){yes = true;break;}
      if(i+2<nums.length && nums[i+2] == 7){yes = true;break;}
    }
    
    
  }
  
  return yes;
  
  
  
  
}
