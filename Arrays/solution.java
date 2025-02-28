// class solution {
//     public static void main(String[] args) {
//         int[] nums = {0,0,0,1,1,1,2,2,3,3,4};
//         int ans = removeDuplicates(nums);
//         System.out.println(ans);
// //        System.out.println(nums);
                
//             }
//             public static int removeDuplicates(int[] nums) {
//             if (nums.length==0){
//                 return 0;
//             }
//             int uniquenum = 1;
//             for(int i = 1;i<nums.length;i++){
//                 if(nums[i-1] != nums[i]){
//                     nums[uniquenum] = nums[i];
//                 uniquenum ++;
//             }
//         }
//         return uniquenum;
//     }
// }

class solution {
    public static void main(String[] args) {
        int[] nums = {2,1,1,1,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}