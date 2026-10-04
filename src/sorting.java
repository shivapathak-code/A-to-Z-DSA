public class sorting {
// merge sort algorithm;
//    class Solution {
//        public void merge(int[] arr , int mid , int left , int right)
//        {
//            //yahan hame copy bana lena hain array ki uske baad
//            int leftArrlen = mid-left+1;
//            int rigthArrlen = right-mid;
//            int leftArr[] = new int[leftArrlen];
//            int rightArr[] = new int[rigthArrlen];
//            //yahan left array ko copy ker liya ;
//            int k = left;
//            for(int i = 0;i<leftArrlen;i++)
//            {
//                leftArr[i] = arr[k];
//                k++;
//            }
//            // yahan per right array ko copy ker liya ;
//            k = mid+1;
//            for(int j = 0;j<rigthArrlen;j++)
//            {
//                rightArr[j] = arr[k];
//                k++;
//            }
//            // here start merging;
//            int i = 0;
//            int j = 0;
//            k = left;
//            while(i<leftArrlen && j<rigthArrlen)
//            {
//                if(leftArr[i] < rightArr[j])
//                {
//                    arr[k] = leftArr[i];
//                    i++;
//                    k++;
//                }
//                else
//                {
//                    arr[k] = rightArr[j];
//                    j++;
//                    k++;
//                }
//            }
//            //jab koi ek array katam ho jaye to dusre vale ko same copy ker do;
//
//            while(j < rigthArrlen)
//            {
//                arr[k] = rightArr[j];
//                j++;
//                k++;
//            }
//            while(i < leftArrlen)
//            {
//                arr[k] = leftArr[i];
//                i++;
//                k++;
//            }
//        }
//        public void Mergesort(int[] arr , int l , int r)
//        {
//            int s = l;
//            int e = r;
//
//            if(s >= e)
//            {
//                return;
//            }
//            // ye kaam divide ne ker diya hain
//            // ab hame seprate kerna hain apne array ko
//            int mid = (s+e)/2;
//            // left part array ka
//            Mergesort(arr , s , mid);
//            // right part array ka
//            Mergesort(arr , mid+1 , e);
//            //yahan se ab ham merge kerna suru karene ;
//            merge(arr , mid , s , e);
//
//        }
//        public int[] mergeSort(int[] nums) {
//            int l = 0;
//            int r = nums.length-1;
//            Mergesort(nums , l , r);
//            return nums;
//
//        }
//    }

    // recusive bubblesort;

//    class Solution {
//        public void recusivelogic(int[] arr , int i , int j)
//        {
//            if(i >= arr.length)
//            {
//                return;
//            }
//
//            while(j < arr.length)
//            {
//                if(arr[i] > arr[j])
//                {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//
//                }
//                j++;
//            }
//            j = i+1;
//            recusivelogic(arr , i+1 , j+1);
//        }
//        public int[] bubbleSort(int[] nums) {
//
//            int i = 0;
//            int j = i+1;
//            recusivelogic(nums , i , j);
//            return nums;
//        }
//    }

    // recusive insertion sort;

//    class Solution {
//        public void recusiveinsertion(int[] arr , int i)
//        {
//            if(i >= arr.length)
//            {
//                return;
//            }
//            int key = arr[i];
//            int j = i - 1;
//
//            while(j >= 0 && arr[j] > key)
//            {
//                arr[j+1] = arr[j];
//                j = j - 1;
//            }
//
//            arr[j+1] = key;
//            recusiveinsertion(arr , i+1);
//        }
//        public int[] insertionSort(int[] nums) {
//            int i = 1;
//            recusiveinsertion(nums , i);
//            return nums;
//        }
//    }
}
