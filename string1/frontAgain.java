public boolean frontAgain(String str) {
  
  if(str.length()<2 ){return false;}
  
  if(str.length()==2 ){return true;}
  
  String first = str.substring(0,2);
  String last = str.substring(str.length()-2,str.length() );
  
  if(first.equals(last) ){return true;}
  
  
  return false;
  
}
