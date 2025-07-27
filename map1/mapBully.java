public Map<String, String> mapBully(Map<String, String> map) {
  
  Map<String, String> myM = new HashMap<String, String>();
  
  for(String key : map.keySet()){
    String valv = map.get(key);
    myM.put(key,valv);
  }
  
  if(myM.containsKey("a")){
    
    String value = myM.get("a");
    
    myM.put("a","");
    myM.put("b",value);
    
    
  }
  
  return myM;
  
  
}
