public boolean only14(int[] nums) {
  boolean yes = true;
  
  for(int n:nums){
    if(n==1||n==4){continue;}
    else{yes = false;break;}
    
  }
  
  return yes;
}
