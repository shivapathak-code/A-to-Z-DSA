 public class Array{

    //class Solution {
        public static void removeDuplicates(int[] nums) {
            int n = nums.length;
            int slow = 0;
            for(int fast = 1;fast<n;fast++)
            {
                if(nums[slow] != nums[fast])
                {
                    slow++;
                    nums[slow] = nums[fast];
                }
            }
            for(int i = 0;i<slow+1;i++)
            {
                System.out.println(nums[i]);
            }
        }
    //}
    public static void main(String[] args)
    {
        int arr[] = {0,0,3,3,5,6};
        removeDuplicates(arr);

    }
}
