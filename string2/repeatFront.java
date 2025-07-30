public String repeatFront(String str, int n) {
  
  
  String Nw = "";
  
  for(int i = 0;i<n;i++){
    String word = str.substring(0, n-i);
    
    Nw += word;
    
    
  }
  
  return Nw;
}
