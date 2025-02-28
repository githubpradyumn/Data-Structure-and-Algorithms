class Solution {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int sol = 0;
        int n = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==nums[count]){
                count ++;
                if (count > n){
                     sol = i ;
                }  
            }
              
        }
        return sol;
    }
}