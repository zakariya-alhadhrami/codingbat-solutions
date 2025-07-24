public boolean startHi(String str) {
  
  String hi = "hi";
  if(str.length() < 2){return false;}
  else{
    String check = str.substring(0,2);
    if(hi.equals(check)){return true;}
  else{return false;}}
  
}
