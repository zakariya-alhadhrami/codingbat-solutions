public String frontTimes(String str, int n) {
  if(str.isEmpty() || n == 0 ){return "";}
  
  if(str.length() <3 ){
    
    String w = "";
    for(int i =0;i<n;i++){
      w+=str;
    }
    return w;
    
  }
  else{str = str.substring(0,3);
  String word = "";
  
  for(int i = 0;i<n;i++){
    
    word += str;
  }
  
  return word;}
  
  
  
  
}
