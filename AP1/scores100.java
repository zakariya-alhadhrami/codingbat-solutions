public boolean scores100(int[] nums) {
  boolean check = false;
  
  for(int i=0;i<nums.length-1;i++){
    if(nums[i] == 100 && nums[i+1]==100 ){check = true;break;}
    
  }
  
  return check;
}
