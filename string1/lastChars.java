public String lastChars(String a, String b) {
  
  if(b.isEmpty() && a.isEmpty() ){return "@@";}
  
  if (a.isEmpty()){return "@"+b.substring(b.length() - 1, b.length());}
  
  if (b.isEmpty()){return a.substring(0,1)+"@";}
  
  
  
  return a.substring(0,1)+b.substring(b.length() - 1, b.length());
  
  
}
