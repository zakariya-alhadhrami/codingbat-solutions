public String[] allSwap(String[] strings) {
  
  Map<String, Integer> map = new HashMap<String, Integer>();
  
  for(int i =0;i<strings.length ; i++){
    
    String s = strings[i];
    String firstletter = s.substring(0,1);
    
    if(!map.containsKey(firstletter) ){
      map.put(firstletter, i);
    }
    else{
      String temp = strings[i];
      strings[i] = strings[map.get(firstletter)];
      strings[map.get(firstletter)] = temp;
      
      map.remove(firstletter);

    }
    
  }
  
  return strings;
  
}
