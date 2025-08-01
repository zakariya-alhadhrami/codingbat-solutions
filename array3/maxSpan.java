public int maxSpan(int[] nums) {
  
  if (nums.length == 0) {return 0;}
  if (nums.length == 1) {return 1;}
  
  int max = 0;
  
  for(int i =0;i<nums.length-1;i++){
    
    for(int j = nums.length-1; j>=i;j--){
      
      if(nums[i] == nums[j]){
        
        int findSpan = j - i +1;
        
        if(findSpan > max){max = findSpan;}
        break;
      }
      
    }
    
    
  }
  
  return max;
  
}
