/*Question 2
Given an array nums of n integers, return an array of all the unique quadruplets
[nums[a], nums[b], nums[c], nums[d]] such that:
        0 <= a,b,c,d < n
        a, b, c, and d are distinct
        nums[a] +  nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]] */

import java.util.*;

public class Q2 {

    static List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        List<List<Integer>> allQuadruple = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for(int j = i + 1; j < n; j++){
                if(j != i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                
                int start = j + 1;
                int end = n - 1;

                while(start < end){
                    int sum = nums[i];
                    sum += nums[j];
                    sum += nums[start];
                    sum += nums[end];

                    if(sum == target){
                        allQuadruple.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        start++;
                        end--;
                        while(start < end && nums[start] == nums[start - 1]){
                            start ++;
                        }
                        while(start < end && nums[end] == nums[end + 1]){
                            end--;
                        }
                    }
                    else if(sum < target){
                        start++;
                    }
                    else{
                        end--;
                    }
                }
            }
        }
        return allQuadruple;
    }

    public static void main(String[] args) {

        int nums[] = {1,0,-1,0,-2,2};
        int target = 0;

        System.out.println(fourSum(nums, target));
        
    }
}