package AgodaInterviewPrep;

import java.util.PriorityQueue;

public class LastStoneWeight {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println("Last Stone Weight: " + s.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    System.out.println("Last Stone Weight: " + s.lastStoneWeight(new int[]{2,2}));
  }
}

class Solution {
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(b, a));
    for(int stone : stones) pq.add(stone);
    while(pq.size() > 1){
      int x = pq.poll();
      int y = pq.poll();
      if(x != y) pq.add(x-y);
    }
    return pq.isEmpty() ? 0 : pq.poll();
  }
}