public int[] front11(int[] a, int[] b) {
  
  int[] front = new int[2];
  int[] frontZ = new int[1];
  
  if(a.length == 0 && b.length == 0){return a;}
  
  if(a.length == 0){frontZ[0] = b[0]; return frontZ;}
  if(b.length == 0){frontZ[0] = a[0]; return frontZ;}
  
  front[0] = a[0];
  front[1] = b[0];
  
  return front;
  
  
}
