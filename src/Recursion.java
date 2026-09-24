public class Recursion {
    public static void main(String[] args)
    {

        printHello(6);

    }
    public static void printHello(int n){

        if(n == 0)
        {
            return;
        }

        System.out.println("hello");
        printHello(n -1);

    }
}
