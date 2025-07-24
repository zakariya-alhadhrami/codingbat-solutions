public String frontBack(String str) {
  
  if(str.length() <= 1 ){return str;}
  else{
    
    char firstletter = str.charAt(0);
    
    char lastletter = str.charAt(str.length() - 1 );
    
    return lastletter + str.substring(1, str.length() - 1) + firstletter;
    
    
  }
  
  
}
