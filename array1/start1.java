public int start1(int[] a, int[] b) {
  int count =0;
  
  if(a.length == 0 && b.length == 0){return count;}
  
  if(a.length == 0){
    if(b[0] == 1){count +=1;}
    return count;
  }
  
  if(b.length == 0){
    if(a[0] == 1){count +=1;}
    return count;
  }
  
  
  if (a[0] == 1){count += 1;}
  
  if(b[0] == 1){count +=1;}
  
  return count;
}
