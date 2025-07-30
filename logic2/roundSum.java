public int roundSum(int a, int b, int c) {
  
  return round10(a)+round10(b)+round10(c);
  
}

public int round10(int n){
  
  int check = n % 10;
  
  if(check>=5){return n + (10 - check);}
  return n - (check);

    
}
