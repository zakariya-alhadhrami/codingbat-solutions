public String notString(String str) {
  String not1 = "not ";
  String not2 = "not";
  String space = " ";
  
  String[] words = str.split(space);
  
  for(String s : words){
    
    if (not2.equals(s)){
      return str;
    }
    break;
  
  }
  
  return not1.concat(str);
  
  
  
  

}
