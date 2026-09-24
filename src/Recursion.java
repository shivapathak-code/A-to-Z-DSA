public class Recursion {
    public static void main(String[] args)
    {

        //printHello(6);
        //print1T010(10);
        print10T01(10);

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

    public static void print10T01(int n){

        if(n == 0)
        {
            return ;
        }

        System.out.println(n);
        print10T01(n -1);


    }
}
