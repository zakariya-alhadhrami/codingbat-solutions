public int scoreUp(String[] key, String[] answers) {
  int score =0;
  
  for(int i = 0;i<key.length;i++){
    
    String right = key[i];
    String student = answers[i];
    
    if(student.equals("?") ){continue;}
    
    
    if(right.equals(student) ){
      score+=4;
    }
    else{
      score -=1;
    }
    
    
  }
  
  return score;
}
