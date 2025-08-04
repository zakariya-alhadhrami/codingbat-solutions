public int matchUp(String[] a, String[] b) {
  
  int count = 0;
  
  for(int i = 0;i<a.length;i++){
    
    String w1 = a[i];
    String w2 = b[i];
    
    if(!a[i].isEmpty() && !b[i].isEmpty() ){
      if(w1.charAt(0) == w2.charAt(0)){ count += 1;}
    }
    
  
    
    
    
  }
  
  return count;
  
}
