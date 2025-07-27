public int sum2(int[] nums) {
  int sum = 0;
  
  if(nums.length == 0){return sum;}
  else if(nums.length < 2){return nums[0];}
  else{
    
    sum+= nums[0];
    sum+= nums[1];
    
    return sum;
    
  }
}
