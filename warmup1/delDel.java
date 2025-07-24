public String delDel(String str) {
  
  String del = "del";
  
  if(str.length() <= 3)
  {
    return str;}
  
  String firstletter = str.substring(0, 1);
  String checkdel = str.substring(1, 4);
    
  if (del.equals(checkdel)){
    return firstletter + str.substring(4, str.length());}
    
  return str;
  
  
}
