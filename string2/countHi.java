public int countHi(String str) {
  
  int count = 0;
  
  for(int i = 0;i<str.length();i++ ){
    if(i == str.length()-1 ){break;}
    char letter = str.charAt(i);
    
    if(letter == 'h' && str.charAt(i+1) == 'i'){count+=1;}
  }
  
  return count;
  
}
