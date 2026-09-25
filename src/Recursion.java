public class Recursion {
    public static void main(String[] args)
    {

        //printHello(6);
        //print1T010(10);
        //print10T01(10);
        //int factorial = fact(5);
        //System.out.println("factorial " + factorial);
       // System.out.println(powOf2(5));
        //System.out.println(fib(4));
       int arr[] = {10,20,30,40,50,60,70,80,90 };
//        int i = 0;
//        int max = Integer.MIN_VALUE;
//        maxelementinArray(arr , i , max);
//        int min = Integer.MAX_VALUE;
//        minelementinArray(arr , i , min);
//        int tar = 30;
//        int count = 0;
//        countfreqelement(arr , i , count ,tar);

        //printdigit(123);
//        int arr[] = {1,2,3,4,5};
//        int sum = 0;
//        System.out.println(sumofArray(arr , 0));

//        int n = 13;
//
//        if (prime(n)) {
//            System.out.println(n + " is a prime number.");
//        } else {
//            System.out.println(n + " is not a prime number.");
//        }
        // reverse the array using loop;
        int n = arr.length;
        int mid = 0+(n-0)/2;
        //if(n%2 == 0) {
            for (int i = 0; i < mid; i++) {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
//        }else {
//            for (int i = 0; i < mid; i++) {
//                int temp = arr[i];
//                arr[i] = arr[n - i - 1];
//                arr[n - i - 1] = temp;
//            }
        //}
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }


    }
//    public static void printHello(int n){
//
//        if(n == 0)
//        {
//            return;
//        }
//
//        System.out.println("hello");
//        printHello(n -1);
//
//    }

//    public static void print1T010(int n){
//
//        if(n == 0)
//        {
//            return ;
//        }
//
//
//        print1T010(n -1);
//        System.out.println(n);
//
//    }

//    public static void print10T01(int n){
//
//        if(n == 0)
//        {
//            return ;
//        }
//
//        System.out.println(n);
//        print10T01(n -1);
//
//
//    }

//    public static int fact(int n){
//
//        if(n == 0)
//        {
//            return 1 ;
//        }
//
//        return n * fact(n -1);
//
//
//    }

//    public static int powOf2(int n){
//
//        if(n == 0)
//        {
//            return 1 ;
//        }
//
//        return 2 * powOf2(n -1);
//
//
//    }

//    public static int fib(int n){
//
//        if(n == 0)
//        {
//            return 0;
//        }
//        if(n == 1)
//        {
//            return 1;
//        }
//
//        return (fib(n-1)+fib(n-2));
//
//
//    }

//    public static void Array(int[] arr ,int i){
//
//        if(i >= arr.length)
//        {
//            return;
//        }
//        System.out.println(arr[i]);
//        Array(arr , i+1);
//
//
//    }

    // reverce the array element;
//    public static void Array(int[] arr ,int i){
//
//        if(i >= arr.length)
//        {
//            return;
//        }
//
//        Array(arr , i+1);
//        System.out.println(arr[i]);
//
//    }
 //  find maxmimum number in array using recursion :
//    public static void maxelementinArray(int[] arr ,int i , int mxi){
//
//        if(i >= arr.length)
//        {
//            System.out.println("max value " + mxi);
//            return;
//        }
//            if(arr[i] > mxi)
//            {
//                mxi = arr[i];
//            }
//        maxelementinArray(arr ,i+1 , mxi);
//
//
//    }

//    public static void minelementinArray(int[] arr ,int i , int min){
//
//        if(i >= arr.length)
//        {
//            System.out.println("max value " + min);
//            return;
//        }
//        if(arr[i] < min)
//        {
//            min = arr[i];
//        }
//        minelementinArray(arr ,i+1 , min);
//
//
//    }

//    public static void linearSearch(int[] arr ,int i ,int target){
//
//            if(arr[i] == target)
//            {
//                System.out.println(i);
//                return;
//            }
//        linearSearch(arr ,i+1  , target);
//
//
//    }
 // count array element ;
//    public static void countelement(int[] arr ,int i ,int count){
//
//        if(i >= arr.length)
//        {
//            System.out.println(count);
//            return;
//        }
//        count++;
//        countelement(arr ,i+1  , count);
//
//
//    }
// count frequency of number;
//    public static void countfreqelement(int[] arr ,int i ,int count , int target){
//
//        if(i >= arr.length)
//        {
//            System.out.println(count);
//            return;
//        }
//        if(arr[i] == target) {
//            count++;
//        }
//        countfreqelement(arr ,i+1  , count , target);
//
//
//    }

//    public static void printdigit(int n)
//    {
//        if(n == 0)
//        {
//            return;
//        }
//
//        int d = n%10;
//        //System.out.println(d);
//        n = n / 10;
//        printdigit(n);
//        System.out.println(d);
//    }
//    public static int sumofArray(int[] arr , int i)
//    {
//        int sum = 0;
//        if(i>= arr.length)
//        {
//            //System.out.println(sum);
//            return sum;
//        }
//        sum += arr[i];
//         return sumofArray(arr , i+1);
//
//    }

//    public static boolean prime(int n , int i)
//    {
//        if(n < 2)
//        {
//            return false;
//        }
//
//        if(i > Math.sqrt(n))
//        {
//            return true;
//        }
//        if(n % i == 0)
//        {
//            return false;
//        }
//        return prime(n , i+1);
//
//    }

//        public static boolean prime(int n) {
//
//            if(n<2)
//            {
//                return false;
//            }
//            for(int i = 2;i<=Math.sqrt(n);i++)
//            {
//                if(n % i == 0)
//                {
//                    return false;
//                }
//            }
//            return true;
//        }

//    public static void arrayReverse(int[] arr , int i)
//    {
//        if(i>=arr.length)
//        {
//            return;
//        }
//
//    }

    }

