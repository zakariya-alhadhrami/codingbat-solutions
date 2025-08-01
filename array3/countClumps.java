public int countClumps(int[] nums) {
  int count = 0;
  boolean in = false;

  for (int i = 0; i < nums.length-1; i++) {
    if (nums[i] == nums[i+1]) {
      if (!in) {
        count+=1;
        in = true;
      }
    } else {
      in = false;
    }
  }

  return count;
}
