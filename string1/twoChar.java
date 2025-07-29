public String twoChar(String str, int index) {
  
  int count = index + 2;
  
  if (count > str.length() ){
    return str.substring(0, 2);
  }
  
  if(index < 0 ){
    return str.substring(0, 2);
  }
  
  return str.substring(index, count);
  
}
