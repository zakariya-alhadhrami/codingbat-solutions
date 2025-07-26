public String comboString(String a, String b) {
  if(a.isEmpty() && b.isEmpty()){return a+b+a;}
  else{
    
    if (a.length() > b.length()   ){return b+a+b;}
    else{return a+b+a;}
    
  }
}
