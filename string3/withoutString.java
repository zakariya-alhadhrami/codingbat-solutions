public String withoutString(String base, String remove) {
  
  
  if(base.equals(remove) ){return "";}
  if(base.length()<remove.length()){return base;}
  else{
    
    String result ="";
    
    for(int i =0;i<base.length(); ){
      
      if(i+remove.length() >base.length() ){result += base.charAt(i); i++; continue;}
      
      String check = base.substring(i, i + remove.length());
      
      
      if(check.toLowerCase().equals(remove.toLowerCase()) ){i += remove.length();}
      else{
        
        result += base.charAt(i);
        i++;
        
      }
      
      
      
    }
    return result;
    
    
  }
}
