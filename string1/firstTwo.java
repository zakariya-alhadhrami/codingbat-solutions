public String firstTwo(String str) {
  
  if(str.isEmpty()){return "";}
  else if(str.length() <= 2){return str;}
  else{
    
    String first2=str.substring(0, 2);
    
    return first2;
    
  }
  
  
}
