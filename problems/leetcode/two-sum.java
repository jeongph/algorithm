class S {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        boolean isFind = false;

        for (int i = 0; i < nums.length; i++) {
            if( isFind ) break;
            for(int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    isFind = true;
                    break;
                }
            }
        }

        return ans;
    }
}

public class Solution{
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] v = S.twoSum(nums, target);
        for(int i = 0; i < v.length; i++){
            System.out.println(v[i]);
        }

    }
}
