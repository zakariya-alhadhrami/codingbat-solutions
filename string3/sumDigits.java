public int sumDigits(String str) {
  
  int sum = 0;
  
  for(int i = 0; i<str.length();i++ ){
    
    char w = str.charAt(i);
    String temp = ""+w;
    
    if(Character.isDigit(w)){sum += Integer.parseInt(temp);}
    
    
    
  }
  return sum;
  
  
}
