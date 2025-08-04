public String[] wordsWithout(String[] words, String target) {
  int count = 0;
  int index = 0;
  
  for(String s : words){
    if(!s.equals(target) ){count+=1;}
  }
  
  
  String[] letters = new String[count];
  
  for(int i = 0 ;i<words.length;i++){
    if(words[i].equals(target) ){ continue;}
    else{
      letters[index] = words[i];
      index++;
    }
      
    
  }
  
  return letters;
  
}
