public int arrayCount9(int[] nums) {
  int count = 0;
  
  for(int n:nums){
    if(n == 9){count+=1;}
  }
  
  return count;
  
}
