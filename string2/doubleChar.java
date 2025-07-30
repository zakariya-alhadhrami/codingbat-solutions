public String doubleChar(String str) {
  
  String Word = "";
  
  for(int i = 0;i<str.length();i++ ){
    char letter = str.charAt(i);
    Word += letter+""+letter;
  }
  
  return Word;
  
}
