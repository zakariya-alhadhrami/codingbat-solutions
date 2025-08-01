public boolean more14(int[] nums) {
  int count1 = 0;
  int count4 = 0;
  for(int n:nums){
    if(n == 1){count1+=1;}
    
    if(n == 4){count4+=1;}
  }
  
  if(count1>count4){return true;}
  return false;
}
