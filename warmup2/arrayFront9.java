public boolean arrayFront9(int[] nums) {
  boolean check = false;
  
  if(nums.length <=4){
    for(int n:nums){
    if(n == 9){check = true;break;}
  }
  return check;
  }
  
  else{
    if(nums.length > 4){
    
    int diff = nums.length - 4;
    
    for(int i = 0; i<nums.length - diff;i++){
      
      if(nums[i]==9){check = true;break;}
      
    }
    
    
  }
    return check;
  }
    
    
  
  
  
  
  
  
  
}
