public boolean parrotTrouble(boolean talking, int hour) {
  if(hour > 0 && hour < 24){
    
    if (hour < 7 || hour > 20){
      if(talking){
        return true;
      }
      else{return false;}
    }
    else{return false;}
    
    
    
  }
  else{
    return false;
  }
  
  
}
