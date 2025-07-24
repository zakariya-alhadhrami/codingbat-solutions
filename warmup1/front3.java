public String front3(String str) {
  
  if(str.length() <= 3){return str+str+str;}
  else{
    String cut = str.substring(0, 3);
    return cut+cut+cut;
    
  }
}
