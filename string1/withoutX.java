public String withoutX(String str) {
  
  if(str.equals("x") || str.isEmpty() ){return "";}
  String checkFront = str.substring(0,1);
  String checkBack = str.substring(str.length()-1,str.length() );
  
  if(checkFront.equals("x") && checkBack.equals("x") ){
    return str.substring(1, str.length()-1);
  }
  
  if(checkFront.equals("x")){return str.substring(1);}
  if(checkBack.equals("x")){return str.substring(0,str.length()-1);}
  
  return str;
}
