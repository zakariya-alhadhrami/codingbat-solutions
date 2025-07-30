public String mixString(String a, String b) {
  
  if(a.length() > b.length()){
    String word = "";
    
    for(int i = 0; i < a.length(); i++ ){
      char letA = a.charAt(i);
      
      if (i >= b.length()){
        return word + a.substring(i);
      }
      
      char letB = b.charAt(i);
      word += letA + "" + letB;
    }
    
    return word;
  }
  else {
    String word = "";
    
    for(int i = 0; i < b.length(); i++ ){
      char letB = b.charAt(i);
      
      if (i >= a.length()){
        return word + b.substring(i);
      }
      
      char letA = a.charAt(i);
      word += letA + "" + letB;
    }
    
    return word;
  }
}
