public String startWord(String str, String word) {
  
  int lenWord = word.length();
  
  if(str.length() >= lenWord ){
    String checkWord = str.substring(0,lenWord);
    if(checkWord.substring(1).equals(word.substring(1))){
      return str.substring(0, lenWord);
    }
  }
  
  return "";
    
  
  
  
  
}
