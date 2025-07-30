public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  
  String check = "";
  
  for(String s : strings){
    if(!map.containsKey(s) ){
      
      map.put(s,0);
      
    }
  }
  
  return map;
  
}
