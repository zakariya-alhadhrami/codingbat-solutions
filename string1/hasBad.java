public boolean hasBad(String str) {
  
  
  if(str.length() == 3 ){
    
    if(str.equals("bad")){return true;}
    else{return false;}
    
  }
  
  else if(str.length() < 3 ){return false;}
  
  else{
    String check0 = str.substring(0,3);
    String check1 = str.substring(1,4);
    if(check0.equals("bad") || check1.equals("bad")) {return true;}
    else{return false;}
    
  }
  
  
  
  
}
