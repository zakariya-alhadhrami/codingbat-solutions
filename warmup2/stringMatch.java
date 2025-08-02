public int stringMatch(String a, String b) {
  if(a.length() == b.length()|| b.length() < a.length() ){
    
    int count = 0;
    
    for(int i=0;i<b.length()-1;i++ ){
      String sa = a.substring(i,i+2);
      String sb = b.substring(i,i+2);
      
      if(sb.equals(sa)){count+=1;}
    }
    
    return count;
    
    
  }
  
  else{
    int count = 0;
    
    for(int i=0;i<a.length()-1;i++ ){
      String sa = a.substring(i,i+2);
      String sb = b.substring(i,i+2);
      
      if(sa.equals(sb)){count+=1;}
    }
    
    return count;
    
    
    
    
    
    
  }
}
