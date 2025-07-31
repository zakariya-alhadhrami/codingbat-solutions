public boolean gHappy(String str) {
  str = str.toLowerCase();
  
  
  for (int i = 0; i < str.length(); i++) {
    char checkG = str.charAt(i);

    if (checkG == 'g') {
      boolean left = (i > 0) && (str.charAt(i - 1) == 'g');
      boolean right = (i < str.length() - 1) && (str.charAt(i + 1) == 'g');

      if (!(left || right)) {
        return false;
      }
    }
  }
  return true;
  
}
