public boolean mixStart(String str) {
  if(str.length() < 3 ){return false;}
  
  String checkfor2 = str.substring(1, 3);
  
  if(checkfor2.equals("ix")){return true;}
  else{return false;}
  
}
