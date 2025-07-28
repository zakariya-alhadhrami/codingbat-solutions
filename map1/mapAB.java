public Map<String, String> mapAB(Map<String, String> map) {
  
  if(map.containsKey("a") && map.containsKey("b") ){
    
    String con = map.get("a") + map.get("b");
    
    map.put("ab", con);
    return map;
    
  }
  else{return map;}
  
}
