public String[] firstSwap(String[] strings) {
  
  Map<String, Integer> mapIndex = new HashMap<String, Integer>();
  Map<String, Boolean> mapDone = new HashMap<String, Boolean>();
  
  for(int i =0;i<strings.length ; i++){
    
    String s = strings[i];
    String firstletter = s.substring(0,1);
    
    if(!mapIndex.containsKey(firstletter) ){
      mapIndex.put(firstletter, i);
      mapDone.put(firstletter,false);
      
    }
    else{
      
      if(!mapDone.get(firstletter)){
        
        String temp = strings[i];
        strings[i] = strings[mapIndex.get(firstletter)];
        strings[mapIndex.get(firstletter)] = temp;
        
        mapDone.put(firstletter,true);
        
      }
      
      
      
      
      
      
      

    }
    
  }
  
  return strings;
}
