public String lastTwo(String str) {
  if(str.length() < 2){return str;}
  
  if(str.length() == 2){
    char lett1 = str.charAt(0);
    char lett2 = str.charAt(1);
    
    return ""+lett2+lett1;
  }
  
  else{
    
    char lett1 = str.charAt(str.length() - 2);
    char lett2 = str.charAt(str.length() - 1);
    
    return str.substring(0, str.length() - 2)+lett2+lett1;
    
    
  }
}
