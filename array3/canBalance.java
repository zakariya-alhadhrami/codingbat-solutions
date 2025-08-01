public boolean canBalance(int[] nums) {
  int check = 0;
  boolean hmm = false;
  
  for(int i = 0;i<nums.length;i++){
    check += nums[i];
    int sum = 0;
    
    for(int j = i+1;j<nums.length;j++){
      
      sum += nums[j];
      
    }
    
    if(check == sum){hmm = true;}
    
    
  }
  
  return hmm;
}
