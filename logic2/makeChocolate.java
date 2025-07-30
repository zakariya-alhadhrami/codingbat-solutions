public int makeChocolate(int small, int big, int goal) {
  int bigB = Math.min(goal / 5, big);
  
  int remain = goal - (bigB*5);
  
  if(small >= remain){return remain;}
  return -1;

}
