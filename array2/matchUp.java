public int matchUp(int[] nums1, int[] nums2) {
  
  int count = 0;
  
  for(int i = 0;i<nums1.length;i++){
    
    if(check(nums1[i],nums2[i]) ){count+=1;}
    
  }
  
  return count;
  
  
}

public boolean check(int n, int m){
  
  if( n!=m && Math.abs(n-m) <=2 ){return true;}
  else{return false;}
  
}
