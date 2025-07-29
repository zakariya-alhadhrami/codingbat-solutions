public String conCat(String a, String b) {
  
  if(a.isEmpty() && b.isEmpty()){return a+b;}
  
  if(a.isEmpty()){
    return b;
  }
  
  if(b.isEmpty()){
    return a;
  }
  
  
  String lastChar = a.substring(a.length()-1,a.length());
  
  if(lastChar.equals(b.substring(0,1) ) ){
    return a.substring(0,a.length()-1)+b;
  }
  
  return a+b;
  
}
