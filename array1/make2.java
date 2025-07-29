public int[] make2(int[] a, int[] b) {
  int[] newMake = new int[2];
  if(a.length == 0 && b.length == 0){return newMake;}
  
  if(a.length == 0){return b;}

  
  if(a.length == 1){
    newMake[0] = a[0];
    newMake[1] = b[0];
    return newMake;
  }
  if(a.length >= 2){
    newMake[0] = a[0];
    newMake[1] = a[1];
    return newMake;
  }
  
    return newMake;
}
