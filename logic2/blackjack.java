public int blackjack(int a, int b) {
  int diff1 = Math.abs(a - 21);
  int diff2 = Math.abs(b - 21);
  
  if(a > 21 && b > 21){return 0;}
  
  if(diff1 < diff2){
    if(a > 21){return b;}
    return a;
  }
  else{
    if(b > 21){return a;}
    return b;
  }
  
  
  
}
