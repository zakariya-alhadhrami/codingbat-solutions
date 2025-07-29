public String deFront(String str) {    
  
  String checkA= str.substring(0,1);
  String checkB = str.substring(1,2);
  String word = str.substring(2);
  
  
  if(checkA.equals("a") ){
    if(checkB.equals("b") ){return str;}
    
    else{return checkA+word;}
    
  }
    
  if(checkB.equals("b") ){return checkB+word;}
  
  return word;
  
    
  
  
  
}
