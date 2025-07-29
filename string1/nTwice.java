public String nTwice(String str, int n) {
  String first = str.substring(0, n);
  
  String second = str.substring((str.length() - n ), str.length() );
  
  return first + second;
}
