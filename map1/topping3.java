public Map<String, String> topping3(Map<String, String> map) {
  if(map.containsKey("potato")){
    
    String valv = map.get("potato");
    map.put("fries",valv);
    
  }
  if(map.containsKey("salad") ){
    String valv1 = map.get("salad");
    map.put("spinach",valv1);
  }
  
  return map;
}
