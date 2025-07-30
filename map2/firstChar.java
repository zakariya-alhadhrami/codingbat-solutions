public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  
  for(String s: strings){
    
    String letter = s.substring(0, 1);
    String checkIn = "";
    
    for (String w: strings){
      
      if (w.substring(0,1).equals(letter)){
        checkIn += w;
        
      }
    }
    
    map.put(letter, checkIn);
    
  }
  
  return map;
  
  
}
