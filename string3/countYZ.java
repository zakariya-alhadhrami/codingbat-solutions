public int countYZ(String str) {
  
  int count = 0;
  
  for(int i = 0; i < str.length();i++ ){
    char Wanted = str.toLowerCase().charAt(i);
    
    if(i == str.length()-1){
      if(Wanted == 'z'|| Wanted == 'y'){count+=1; break;}
      else{break;}
      
      
    }
    
    char Charac = str.charAt(i+1);
    
    if((Wanted == 'z'|| Wanted == 'y') && !Character.isLetter(Charac)){count+=1;}
  }
  
  return count;
  
}
