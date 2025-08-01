public int countEvens(int[] nums) {
  int count = 0;
  
  for(int n : nums){
    if(n % 2==0){count+=1;}
  }
  
  return count;
}
