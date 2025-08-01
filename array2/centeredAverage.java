public int centeredAverage(int[] nums) {
  
  int max = nums[0];
  for(int n:nums){
    
    if(n >= max){ max = n;}
  }
  
  int min = nums[0];
  
  for(int i :nums){
    if(i<=min){min = i;}
  }
  
  boolean skippedMin = false;
  boolean skippedMax = false;
  int sum =0;
  int count =0;
  
  for (int n : nums) {
      if (n == min && !skippedMin) {
          skippedMin = true;
          continue;
      }
      if (n == max && !skippedMax) {
          skippedMax = true;
          continue;
      }
      sum += n;
      count+=1;
  }
  
  return sum/count;
  
  
}
