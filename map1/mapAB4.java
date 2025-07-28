public Map<String, String> mapAB4(Map<String, String> map) {
  if (map.containsKey("a")&&map.containsKey("b") ){
    
    String valv1 = map.get("a");
    String valv2 = map.get("b");
    
    if(valv1.length() == valv2.length() ){
      map.put("a","");
      map.put("b","");
      return map;
      
    }
    else{
      if(valv1.length() > valv2.length() ){
        
        map.put("c",valv1);
        return map;
        
      }
      else{map.put("c",valv2);return map;}
      
    }
      
    
  }
  
  return map;
}
