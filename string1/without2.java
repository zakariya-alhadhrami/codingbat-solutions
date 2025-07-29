public String without2(String str) {

  if(str.isEmpty() ){return "";} 
  if(str.length()<2 ){return str;}
  
  if(str.length()==2 ){return "";}
  
  String front = str.substring(0,2);
  
  if(front.equals(str.substring(str.length()-2))){
    return str.substring(2);
  }
  
  
  return str;
}
