public boolean bobThere(String str) {
  if(str.length() <3 ){return false;}
  
  if(str.length() == 3){
    char checkB = str.charAt(0);
    char checkB2 = str.charAt(2);
    
    if(checkB == 'b' && checkB2 == 'b'){return true;}
    
  }
  
  
  if(str.length() > 3){
    for(int i =0;i<str.length()-2;i++){
    
    char checkB = str.charAt(i);
    char checkB2 = str.charAt(i+2);
    
    if(checkB == 'b' && checkB2 == 'b'){return true;}}
    
    return false;
    
    
    
  }
  
  return false;
  
}
