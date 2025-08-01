public boolean lucky13(int[] nums) {
  boolean yes = true;
  for(int n:nums){
    if(n==1 || n==3){yes = false;break;}
    
  }
  return yes;
}
