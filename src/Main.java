public class Main {
        static class Solution {
//
//            public boolean isHeap(int[] nums) {
//
//                int n = nums.length;
//
//                for (int i = 0; i < n / 2; i++) {
//
//                    int left = 2 * i + 1;
//                    int right = 2 * i + 2;
//
//                    if (left < n && nums[i] > nums[left]) {
//                        return false;
//                    }
//
//                    if (right < n && nums[i] > nums[right]) {
//                        return false;
//                    }
//                }
//
//                return true;
//            }
//        }

    public int[] minToMaxHeap(int[] nums) {
        int n = nums.length;

        for(int i = n/2-1;i >= 0;i--)
        {
            heapify(nums , i ,n);
        }
        return nums;
    }
    private void heapify(int[] nums , int i , int n)
    {
        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && nums[left] > nums[largest])
        {
            largest = left;
        }
        if( right < n && nums[right] > nums[largest])
        {
            largest = right;
        }

        if(largest!=i)
        {
            int temp = nums[i];
            nums[i] = nums[largest];
            nums[largest] = temp;
            heapify(nums , largest , n);
        }

    }
}


public static void main(String[] args) {

            int arr[] = {2 ,4 ,3 ,1};

            Solution s = new Solution();

            int[] ans = s.minToMaxHeap(arr);

            for(int i = 0;i<ans.length;i++)
            {
                System.out.print(ans[i] + " ");
            }

        }
    }


