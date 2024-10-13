import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MergeOverlappingIntervals{
  public static void main(String[] args){
    List<int[]> intervals = generateRandomIntervals(10000, 0, 90);
    Solution s = new Solution();
    Instant startTime = Instant.now();
    System.out.println(s.mergeOverlappingIntervals(intervals));
    Instant endTime = Instant.now();
    Duration elapsedTime = Duration.between(startTime, endTime);
    long elapsedMilliseconds = elapsedTime.toMillis();
    System.out.println("Total Execution time in Java: " + elapsedMilliseconds);
  }

  public static List<int[]> generateRandomIntervals(int numIntervals, int minTime, int maxTime) {
    List<int[]> intervals = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < numIntervals; i++) {
        int startTime = random.nextInt(maxTime - minTime + 1) + minTime;
        int endTime = random.nextInt(maxTime - startTime + 1) + startTime;

        intervals.add(new int[]{startTime, endTime});
    }

    return intervals;
  }
}

class Solution{
  public int mergeOverlappingIntervals(List<int[]> intervals){
    Collections.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
    int overlappingIntervals = 0;
    int prevEnd = intervals.get(0)[1];
    for(int i = 1; i < intervals.size(); ++i){
      if(intervals.get(i)[0] >= prevEnd ) prevEnd = intervals.get(i)[0];
      else{
        ++overlappingIntervals;
        if(prevEnd < intervals.get(i)[1]) prevEnd = intervals.get(i)[1];
      }
    }
    return overlappingIntervals;
  }
}