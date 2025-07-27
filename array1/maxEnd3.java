public int[] maxEnd3(int[] nums) {
  
  int[] max= {0,0,0};
  
  if(nums[0] > nums[nums.length - 1]){
    
    for (int i = 0; i<nums.length ; i++){
      
      max[i] = nums[0];
    }
    
    return max;
    
  }
  
  else{
    
    for (int i = 0; i<nums.length ; i++){
      
      max[i] = nums[nums.length - 1];
    }
    
    return max;
    
    
  }
  
  
  
}
