public int[] squareUp(int n) {
  int[] result = new int[n * n];

  for (int i = 1; i <= n; i++) {
    int end = n * i - 1;
    for (int j = 1; j <= i; j++) {
      result[end - j + 1] = j;
    }
  }

  return result;
}
