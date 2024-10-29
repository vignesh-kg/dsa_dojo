package AgodaInterviewPrep;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.canFinish(2, new int[][]{{1,0}}));
    System.out.println(s.canFinish(2, new int[][]{{1,0}, {0,1}}));
  }
}

class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    if(numCourses == 1) return true;
    List<List<Integer>> adjList = new ArrayList<>();
    for(int i = 0; i < numCourses; ++i) adjList.add(new ArrayList<>());
    for(int[] prerequisite : prerequisites) adjList.get(prerequisite[0]).add(prerequisite[1]);
    boolean[] isVisited = new boolean[numCourses];
    boolean[] pathVisited = new boolean[numCourses];
    for(int i = 0; i < numCourses; ++i){
      if(!isVisited[i] && isCyclic(adjList, isVisited, pathVisited, i)) return false;
    }
    return true;
  }

  private boolean isCyclic(List<List<Integer>> adjList, boolean[] isVisited, boolean[] pathVisited, int course){
    isVisited[course] = true;
    pathVisited[course] = true;

    for(int i : adjList.get(course)){
      if(!isVisited[i] && isCyclic(adjList, isVisited, pathVisited, i)) return true;
      else if(pathVisited[i]) return true;
    }
    pathVisited[course] = false;
    return false;
  }
}