public String minCat(String a, String b) {
  
  if(a.length() == b.length()){return a+b;}
  
  if(a.isEmpty()|| b.isEmpty() ){return "";}
  
  int len1 = a.length();
  int len2 = b.length();
  
  int diff = Math.abs(len1-len2);
  
  if(len1>len2){
    
    
    return a.substring(diff)+b;
  }
  else{
    
    return a+b.substring(diff);
  }


  
}
