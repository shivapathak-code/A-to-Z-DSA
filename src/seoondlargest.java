public class seoondlargest {
        public int kthLargestElement(int[] nums, int k) {

            // First k elements ka Min Heap banao
            int[] heap = new int[k];

            for (int i = 0; i < k; i++) {
                heap[i] = nums[i];
            }

            // Build Min Heap
            for (int i = k / 2 - 1; i >= 0; i--) {
                heapify(heap, i, k);
            }

            // Remaining elements check karo
            for (int i = k; i < nums.length; i++) {

                // Agar current element root se bada hai
                if (nums[i] > heap[0]) {

                    // Root ko current element se replace karo
                    heap[0] = nums[i];

                    // Min Heap ko dobara correct karo
                    heapify(heap, 0, k);
                }
            }

            // Root = K-th largest
            return heap[0];
        }

        private void heapify(int[] heap, int i, int n) {

            int smallest = i;

            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < n && heap[left] < heap[smallest]) {
                smallest = left;
            }

            if (right < n && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest != i) {

                int temp = heap[i];
                heap[i] = heap[smallest];
                heap[smallest] = temp;

                heapify(heap, smallest, n);
            }
        }
    public static void main(String[] args) {

        int arr[] = {1 ,2 ,3 ,4,5};

        seoondlargest s = new seoondlargest();

        int ans = s.kthLargestElement(arr , 2);
        System.out.println(ans);



    }
}



