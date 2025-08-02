public String altPairs(String str) {
  String word = "";
  
  for(int i =0;i<str.length();i+=4 ){
    
    
    word += str.substring(i,i+1);
    
    if (i + 1 < str.length()) {
      word += str.charAt(i + 1);
    }
    
    
    
  }
  return word;
}
