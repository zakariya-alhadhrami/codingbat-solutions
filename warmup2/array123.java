public boolean array123(int[] nums) {
  boolean check = false;
  
  if(nums.length < 3){return check;}
  
  else{
    
    for(int i = 0;i<nums.length-2;i++){
      
      if(nums[i] == 1){
        if(nums[i+1] == 2 && nums[i+2] == 3){check = true;break;}
      }
      
    }
    
    return check;
    
    
    
  }
}
