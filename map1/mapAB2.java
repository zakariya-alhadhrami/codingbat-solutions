public Map<String, String> mapAB2(Map<String, String> map) {
  if(map.containsKey("a") && map.containsKey("b") ){
    String valv1 = map.get("a");
    String valv2 = map.get("b");
    
    if(valv1.equals(valv2) ){
      map.remove("a");
      map.remove("b");
    }
  }
  return map;
}
