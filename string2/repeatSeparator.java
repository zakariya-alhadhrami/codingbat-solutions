public String repeatSeparator(String word, String sep, int count) {
  
  if(count == 1){return word;}
  
  int spaces = count - 1;
  
  String bigW = "";
  
  for(int i = 0;i<count+spaces;i++){
    if(i%2==0){bigW+=word;}
    else{bigW+=sep;}
    
  }
  
  return bigW;
  
}
