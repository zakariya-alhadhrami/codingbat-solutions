public String stringBits(String str) {
  String word = "";
  
  for(int i =0;i<str.length();i+=2 ){
    
    char letter = str.charAt(i);
    word+=letter;
    
  }
  
  return word;
  
}
