public String atFirst(String str) {
  
  if(str.length() > 2){return str.substring(0,2);}
  
  if(str.length() == 2){return str;}
  
  if(str.isEmpty()){return "@@";}
  
  return str+"@";
  
}
