int countXX(String str) {
  
  int count = 0;
  
  for(int i = 0;i<str.length()-1;i++ ){
    
    String word = str.substring(i,i+2);
    
    if(word.equals("xx")){count+=1;}
    
    
    
  }
  return count;
  
  
}
