public String seeColor(String str) {
  
  if(str.length() <3){return "";
  }
  
  String checkred = str.substring(0,3);
  
  if(str.length() == 3){
    if(checkred.equals("red") ){return "red";}
    else{return "";}
    
  }
  
  if(str.length() > 3){
    
    String checkblue = str.substring(0,4);
    
    if(checkred.equals("red") ){return "red";}
    else if(checkblue.equals("blue") ){return "blue";}
    else{return "";}
    
  }
  
  
  
  
  
  
  return "";
  
  
  
}
