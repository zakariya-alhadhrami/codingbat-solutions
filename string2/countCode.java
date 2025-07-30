public int countCode(String str) {
  if(str.length() < 3 ){return 0;}
  
  if(str.equals("code") ){return 1;}
  
  
  int count = 0;
  
  for(int i = 0; i<str.length();i++){
    
    if(i == str.length()- 3 ){break;}
    
    String checkCo = str.substring(i,i+2);
    char checkE = str.charAt(i+3);
    
    if(checkCo.equals("co") && checkE == 'e' ){count += 1;}
    
    
  }
  
  
  return count;
}
