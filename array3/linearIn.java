public boolean linearIn(int[] outer, int[] inner) {
  
  int count = 0;
  
  
  int index = 0;
  for(int i = 0;i<inner.length;i++){
    
    for(int j = index;j<outer.length;j++){
      if(inner[i] == outer[j]){count+=1;
        index = j+1;
        break;
        
      }
      
    }
    
    
  }
  
  if(count == inner.length){return true;}
  else{return false;}
  
}
