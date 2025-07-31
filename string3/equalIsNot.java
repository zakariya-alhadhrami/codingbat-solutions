public boolean equalIsNot(String str) {
  
  int countIs = 0;
  int countNot = 0;
  
  for (int i = 0; i<str.length();i++ ){
    
    if(i == str.length()-3){
      if(str.substring(i).equals("not")){countNot += 1;break;}
      
      if(str.substring(i,i + 2).equals("is")){countIs += 1;break;}
      
    }
    else{
      
      if (i <= str.length() - 2) {
    String is = str.substring(i, i + 2);
    if (is.equals("is")) {
      countIs += 1;
    }
  }
    
    if (i <= str.length() - 3) {
    String not = str.substring(i, i + 3);
    if (not.equals("not")) {
      countNot += 1;
    }
  }
    
    
    
    }  
  }
  
  if(countIs == countNot){return true;}
  else{return false;}
  
}
