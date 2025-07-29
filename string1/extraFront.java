public String extraFront(String str) {
  if(str.length() <= 2){return str+str+str;}
  else{
    
    String front2 = str.substring(0,2);
    return front2+front2+front2;
    
  }
}
