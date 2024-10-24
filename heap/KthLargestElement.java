
import java.util.PriorityQueue;

public class KthLargestElement {
  public static void main(String[] args){
    Solution s = new Solution();
    System.out.println(s.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
  }
}

class Solution{
  public int findKthLargest(int[] nums, int k){
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
    for(int num : nums) pq.add(num);
    int result = -1;
    for(int i = 0; i < k; ++i) result = pq.poll();
    return result;
  }
}