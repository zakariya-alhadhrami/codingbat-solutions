public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  
  String result = "";
  
  for(String s:strings){
    if(!map.containsKey(s) ){
      map.put(s,1);
    }
    else{
      int count = map.get(s) + 1;
      
      map.put(s,count);
      
      if(count%2 == 0){result += s;}
    }
  }
  
  return result;
  
  
}
