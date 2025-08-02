public String stringSplosion(String str) {
  String word ="";
  
  for(int i = 1;i<=str.length();i++ ){
    String con = str.substring(0,i);
    
    word += con;
  }
  
  return word;
}
