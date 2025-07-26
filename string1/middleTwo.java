public String middleTwo(String str) {
  int split = str.length()/2;
  
  return str.substring(split-1, split+1);
}
