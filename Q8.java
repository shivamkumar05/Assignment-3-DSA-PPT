/*Question 8
Given an array of meeting time intervals where intervals[i] = [starti, endi],
determine if a person could attend all meetings.

Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false */

import java.util.Arrays;

public class Q8 {
static boolean canAttendMeetings(int[][] intervals) {

        int len = intervals.length;
        int[] startTime = new int[len];
        int[] endTime = new int[len];
        int count = 0;
        for(int[] interval: intervals){
            startTime[count] = interval[0];
            endTime[count++] = interval[1];
        }
        Arrays.sort(startTime);
        Arrays.sort(endTime);
        for(int i = 1; i < len; i++){
            if(startTime[i] < endTime[i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [][] intervals = {{0,30},{5,10},{15,20}};
        System.out.println(canAttendMeetings(intervals));
        
    }
    
}
