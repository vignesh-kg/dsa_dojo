
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class NonOverlappingIntervals {
  static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String[] args){
    Solution s = new Solution();
    out.println(s.eraseOverlapIntervals(new int[][]{{1,2}, {2,3}, {3,4}, {1,3}}));
    out.println(s.eraseOverlapIntervals(new int[][]{{1,100},{11,22},{1,11},{2,12}}));
    out.flush();
    out.close();
    try {
      reader.close();
    } catch (Exception e) {
    }
  }
}

class Solution{
  public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b)-> Integer.compare(a[1], b[1]));
    int noOfOverlappingIntervals = 0;
    int prevEnd = intervals[0][1];
    for(int i = 1; i < intervals.length; ++i){
      if(intervals[i][0] < prevEnd){
        ++noOfOverlappingIntervals;
        if(prevEnd > intervals[i][1]) prevEnd = intervals[i][1];
      } else {
        prevEnd = intervals[i][1];
      }
    }
    return noOfOverlappingIntervals;
  }
}