public int bigDiff(int[] nums) {
  int max = 0;
  for(int n:nums){
    
    if(n >= max){ max = n;}
  }
  
  int min = nums[0];
  
  for(int i :nums){
    if(i<=min){min = i;}
  }
  
  return max-min;
  
}
