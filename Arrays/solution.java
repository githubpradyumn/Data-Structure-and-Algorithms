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
        int[] nums = {0,1,0,3,10};
        int[] ans = moveZeroes(nums);
        System.out.println(nums);
    }
        public static int[]  moveZeroes(int[] nums) {
        int pnt = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                int temp = nums[]];
                nums[pnt] = nums[pnt - 1];
                nums[pnt + 1] = temp;
            }
        }
                return nums;
    }
}