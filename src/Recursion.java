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
        int arr[] = {10,20,30,40,50};
        int i = 0;
        Array(arr , i);

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

    public static void Array(int[] arr ,int i){

        if(i >= arr.length)
        {
            return;
        }
        System.out.println(arr[i]);
        Array(arr , i+1);


    }
}
