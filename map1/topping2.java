public Map<String, String> topping2(Map<String, String> map) {
  if(map.containsKey("ice cream")){
    
    String valv = map.get("ice cream");
    map.put("yogurt",valv);
    
  }
  if(map.containsKey("spinach") ){
    map.put("spinach","nuts");
  }
  
  return map;
}
