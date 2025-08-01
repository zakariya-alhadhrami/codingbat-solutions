public int sum13(int[] nums) {
  int sum = 0;
  
  for(int i = 0;i<nums.length;){
    if(nums[i] == 13){
      i+=2;
    }else{sum+=nums[i];
    i++;}
    
  }
  
  return sum;
}
