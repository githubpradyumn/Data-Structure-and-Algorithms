public class solution {
    public static void main(String[] args) {
        int[] nums = {3,2,2,5,3};
        int val = 3;
        int ans = removeElement(nums , val);
        System.out.println(ans);
    }

    public static int removeElement(int[] nums, int val) {
        int pnt = 0;
//        if (nums.length==0){
//            return 0;
//        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                pnt++;
            }
        }
        return pnt;
    }
}
