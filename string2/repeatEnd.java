public String repeatEnd(String str, int n) {
  String word = str.substring(str.length() - n );
  
  String Nw = "";
  
  for(int i = 0;i<n;i++){Nw+=word;}
  
  return Nw;
  
}
