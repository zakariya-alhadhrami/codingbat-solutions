public boolean sameFirstLast(int[] nums) {
  
  int len = nums.length;
  
  if(len >=1 ){
    if(nums[0] == nums[len-1]){return true;}
    else{return false;}

  }
  else{return false;}
  
  
}
