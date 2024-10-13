public class ProductOfArrayExceptSelf{
  public static void main(String[] args){
    Solution s = new Solution();
    int[] result = s.productExceptSelf(new int[]{1,2,3,4});
    for(int i = 0; i < result.length; ++i)
      System.out.print(result[i] + " ");
    System.out.print("\n");
    result = s.productExceptSelf(new int[]{-1,1,0,-3,3});
    for(int i = 0; i < result.length; ++i)
      System.out.print(result[i] + " ");
    System.out.print("\n");
  }
}

class Solution{
  public int[] productExceptSelf(int[] nums){
    int length = nums.length;
    int[] result = new int[length];
    int product = 1;
    for(int i = 0; i < length; ++i){
      result[i] = product;
      product *= nums[i];
    }
    product = 1;
    for(int i = length-1; i >=0; --i){
      result[i] *= product;
      product *= nums[i];
    }
    return result;
  }
}