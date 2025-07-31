public int countTriple(String str) {
  
  if(str.length() <= 2 ){return 0;}
  
  int count = 0;
  
  for(int i =0; i<str.length();i++ ){
    
    if(i == str.length() - 2){break;}
    
    else{
      char letter = str.charAt(i);
      
      if(letter == str.charAt(i+1) && letter == str.charAt(i+2) ){count+=1;}
      
      
    }
    
    
  }
  
  return count;
  
}
