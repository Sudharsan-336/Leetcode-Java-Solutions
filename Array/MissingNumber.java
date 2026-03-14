package Array;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        int ans=n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return ans-sum;
    }
}
