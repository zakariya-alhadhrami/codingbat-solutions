boolean doubleX(String str) {
  boolean check = false;
  
  
  for(int i = 0;i<str.length()-1;i++ ){
    
    char letter = str.charAt(i);
    
    if(letter == 'x' && str.charAt(i+1) == 'x' ){check = true; break;}
    else if(letter == 'x'){break;}
    
    
  } return check;
}
