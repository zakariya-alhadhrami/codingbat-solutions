public int noTeenSum(int a, int b, int c) {
  
  
  
  a = fixTeen(a);
  b = fixTeen(b);
  c = fixTeen(c);
  
  return a+b+c;
}
public int fixTeen(int n){
    if(n>=13 && n<=19){
      if(n == 15 || n == 16){return n;}
      return 0;
    }
    return n;
  }