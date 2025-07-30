public boolean catDog(String str) {
  
  if(str.length() <2){return true;}
  
  int countCat = 0;
  int countDog = 0;
  
  for(int i = 0; i<str.length() ;i++){
    if(i == str.length() - 2 ){break;}
    
    String checkC = str.substring(i,i+3);
    String checkd = str.substring(i,i+3);
    
    if(checkC.equals("cat") ){countCat +=1;}
    
    if(checkd.equals("dog") ){countDog +=1;}
    
    
  }
  
  if(countCat == countDog){return true;}
  return false;
}
