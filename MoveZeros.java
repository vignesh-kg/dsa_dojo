public class MoveZeros{
  public static void main(String[] args){
    Solution s = new Solution();
    int[] input = new int[]{0,1,0,3,12};
    s.moveZeros(input);
    for(int i = 0; i < input.length; ++i){
      System.out.print(input[i] + " ");
    }
    System.out.print("\n");
    input = new int[]{0};
    s.moveZeros(input);
    for(int i = 0; i < input.length; ++i){
      System.out.print(input[i] + " ");
    }
    System.out.print("\n");
  }
}

class Solution{
  public void moveZeros(int[] nums){
    int nonZeroIndex = 0;
    for(int i = 0; i < nums.length; ++i){
      if(nums[i] != 0){
        int temp = nums[nonZeroIndex];
        nums[nonZeroIndex] = nums[i];
        nums[i] = temp;
        ++nonZeroIndex;
      }
    }
  }
}