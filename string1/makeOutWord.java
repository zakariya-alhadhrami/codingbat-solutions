public String makeOutWord(String out, String word) {
  String firstPart = out.substring(0, 2);
  String secPart = out.substring(2, out.length());
  
  return firstPart+word+secPart;
}
