public String stringX(String str) {
  String word = "";
  
  
  for(int i = 0;i<str.length();i++ ){
    
    if(i == 0|| i==str.length() - 1){
      if(str.charAt(i) == 'x'){word+='x';}
      else{word+=str.charAt(i);}
    }
    else{
      if(str.charAt(i) != 'x'){word+=str.charAt(i);}
    }
    
  }
  
  return word;
}
