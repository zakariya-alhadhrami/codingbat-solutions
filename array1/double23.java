public boolean double23(int[] nums) {
  
  int count2 = 0;
  int count3=0;
  
  for(int i : nums){
    
    if (i == 2){count2+=1;}
    else if(i==3){count3+=1;}
  }
  
  if(count2 == 2 || count3 == 2){return true;}
  else{return false;}
  
  
}
