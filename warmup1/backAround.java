public String backAround(String str) {
  char lastletter = str.charAt(str.length()-1);
  
  if(str.length() <=1){
            return str+str+str;
        }
        else {
            return lastletter+str+lastletter ;
        }
  
  
}
