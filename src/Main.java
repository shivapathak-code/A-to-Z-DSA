public class Main {
        static class Solution {

            public boolean isHeap(int[] nums) {

                int n = nums.length;

                for (int i = 0; i < n / 2; i++) {

                    int left = 2 * i + 1;
                    int right = 2 * i + 2;

                    if (left < n && nums[i] > nums[left]) {
                        return false;
                    }

                    if (right < n && nums[i] > nums[right]) {
                        return false;
                    }
                }

                return true;
            }
        }

        public static void main(String[] args) {

            int arr[] = {10, 20, 30, 25, 15};

            Solution s = new Solution();

            boolean ans = s.isHeap(arr);

            System.out.print(ans);
        }
    }


