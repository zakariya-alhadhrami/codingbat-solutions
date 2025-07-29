public String middleThree(String str) {
  
  if(str.length() == 3 ){return str;}
  
  int start = str.length() / 2;

  
  return str.substring(start-1, start+2) ;
  
}
