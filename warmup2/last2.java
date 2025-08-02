public int last2(String str) {
  int count = 0;
  if(str.length()<=2){return count;}
  
  String target = str.substring(str.length()-2 );
  
  
  
  
  for(int i = 0;i<str.length()-2;i++ ){
    
    String word = str.substring(i,i+2);
    
    if(word.equals(target) ){count += 1;}
    
    
  }
  
  return count;
  
}
