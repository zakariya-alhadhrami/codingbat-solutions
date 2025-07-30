public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  
  for(String s: strings){
    String check = s;
    int count = 0;
    
    for(String w: strings){
      if(check.equals(w) ){count += 1;}
    }
    
    map.put(s, count);
    
  }
  
  return map;
  
  
}
