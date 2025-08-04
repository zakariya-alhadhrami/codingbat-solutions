public boolean nearTen(int num) {
  int remain = num%10;
  
  if(remain <=2){return true;}
  
  else if(remain >=8){return true;}
  
  else{return false;}
}
