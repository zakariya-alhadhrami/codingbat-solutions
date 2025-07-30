public boolean evenlySpaced(int a, int b, int c) {
  int large = Math.max(a,Math.max(b,c));
  int small = Math.min(a,Math.min(b,c));
  int mid = a+b+c - large-small;
  
  if(Math.abs(small-mid) == Math.abs(large-mid) ){return true;}
  return false;
  
}
