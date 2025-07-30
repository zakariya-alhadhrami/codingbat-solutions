public boolean xyBalance(String str) {
  if(!str.contains("x")) {return true;}
  
  int lastX = str.lastIndexOf('x');
  int lastY = str.lastIndexOf('y');

  return lastY > lastX;
  
  
  
  
  
  
}
