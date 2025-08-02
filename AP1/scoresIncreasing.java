public boolean scoresIncreasing(int[] scores) {
  boolean check = false;
  
  for(int i = 1;i<scores.length;i++){
    if(scores[i] >= scores[i-1]){check=true;}
    else{check = false;break;}
  }
  
  return check;
}
