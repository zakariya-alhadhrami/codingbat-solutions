public String withoutX2(String str) {
  
  if(str.equals("x") || str.isEmpty() ||str.equals("xx") ){return "";}
  String checkFirst = str.substring(0,1);
  String checkSec = str.substring(1,2);
  
  if(checkFirst.equals("x") && checkSec.equals("x") ){
    return str.substring(2);
  }
  
  if(checkFirst.equals("x")){
    
    return str.substring(1);
    
  }
  if(checkSec.equals("x")){
    return checkFirst+str.substring(2);
    
  }
  
  return str;
}

