/* Question 6
Given a non-empty array of integers nums, every element appears twice except
for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only
constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1 */

public class Q6 {
static int singleNumber(int[] nums) {

        int xor = 0;

        for(int n : nums){
            xor = xor^n;
        }
        return xor;
    }

    public static void main(String[] args) {

        int nums[] ={2,2,1};
        System.out.println(singleNumber(nums));
        
    }
}