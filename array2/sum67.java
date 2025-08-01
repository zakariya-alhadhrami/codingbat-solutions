public int sum67(int[] nums) {
  int sum = 0;
  boolean inBlock = false;

  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 6) {
      inBlock = true;
    }

    if (!inBlock) {
      sum += nums[i];
    }

    if (inBlock && nums[i] == 7) {
      inBlock = false;
    }
  }

  return sum;
}
