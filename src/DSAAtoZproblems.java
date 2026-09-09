import java.net.SocketOption;

public class DSAAtoZproblems {
//    public static void main(String[] args)   //Neon Number;
//    {
//        int n = 9;
//        int originalnum = n;
//        int squareOfno = n*n;
//        int sum = 0;
//
//        while(squareOfno>0){
//            int d = squareOfno%10;
//            sum = sum+d;
//            squareOfno = squareOfno/10;
//        }
//        if(sum == originalnum)
//        {
//            System.out.println("Neon number");
//        }
//        else {
//            System.out.println("Not Neon number");
//        }
//    }

//    public static void main(String[] args)   //Duck Number;
//    {
//        int n = 1023;
//            while (n > 0) {
//                int d = n % 10;
//                if (d == 0) {
//                    System.out.println("Duck number");
//                    break;
//                }
//
//                n = n / 10;
//            }
//        }
//
//    public static void main(String[] args)  // harshad number
//    {
//        int n = 19;
//        int orginal = n;
//        int sum = 0;
//
//        while(n>0)
//        {
//            int d = n%10;
//            sum+=d;
//            n = n/10;
//        }
//        if(orginal%sum == 0)
//        {
//            System.out.println("Harshed Number");
//        }
//        else
//        {
//            System.out.println(" Not Harshed Number");
//        }
//    }

//    public static void main(String[] args)  // Swap first and last number
//    {
//        int n = 1234;
//        int last = n%10;
//
//        int temp = n;
//        int digit = 0;
//
//        while(temp != 0)
//        {
//            digit++;
//            temp = temp/10;
//        }

    /// /
//        int value = (int)Math.pow(10 , digit-1);
//        int first = n/value;
//
//        int mid = (n%value)/10;
//
//        int result = last*value+mid*10+first;
//        System.out.println(result);
//
//    }

//public static void main(String[] args)  // largest digit
//{
//    int n = 1274;
//    int largest = -1;
//
//    while(n>0)
//    {
//        int d = n%10;
//        if(d > largest)
//        {
//            largest = d;
//        }
//        n = n/10;
//    }
//    System.out.println(largest);
//
//}

//    public static void main(String[] args)  // Smallest digit
//    {
//        int n = 1274;
//        int smallest = Integer.MAX_VALUE;
//
//        while(n>0)
//        {
//            int d = n%10;
//            if(d < smallest)
//            {
//                smallest = d;
//            }
//            n = n/10;
//        }
//        System.out.println(smallest);
//
//    }

//public static void main(String[] args)  // remove all zero from number
//{
//    int n = 102030;
//    int rev = 0;
//
//    while(n>0)
//    {
//        int d = n%10;
//        if(d != 0)
//        {
//            rev = rev*10+d;
//        }
//        n  = n/10;
//    }
//    int revagain = 0;
//    while(rev>0)
//    {
//        int d = rev%10;
//        revagain = revagain*10+d;
//
//        rev = rev/10;
//    }
//    System.out.println(revagain);
//
//}

//public static void main(String[] args)  // remove all zero from number
//{
//    int n = 1;
//    if(n != 1)
//    {
//        for(int i = 2;i<10;i++)
//        {
//            if(n!=i) {
//                if (n % i == 0 && n % n == 0) {
//                    System.out.println(" not  prime digit");
//                    break;
//                }
//            }
//        }
//    }
//    else
//    {
//        System.out.println("enter a valid number");
//    }
//  System.out.print("prime digit");
//}
//    public static void main(String[] args) { // spy number
//        int n = 1124;
//        int sum = 0;
//        int product = 1;
//
//        while (n > 0) {
//            int d = n % 10;
//            sum += d;
//            product *= d;
//            n = n / 10;
//        }
//        System.out.println(sum + " " + product);
//        if (sum == product) {
//            System.out.println("spy number");
//        } else {
//            System.out.println("not spy number");
//        }
//
//
//    }

//    public static void main(String[] args) { // perfect number
//        int n = 28;
//        int sum = 0;
//        for(int i = 1;i<n;i++)
//        {
//            if(n % i == 0)
//            {
//                sum+=i;
//            }
//        }
//        System.out.println(sum);
//    }

    public static void main(String[] args) {
        int n = 145;
        int sum = 0;
        while(n>0)
        {
            int d = n%10;
            int f = 1;
            for(int i = 1;i<=d;i++)
            {
                f = f*i;
            }
            sum+=f;
            n = n/10;
        }
        System.out.println(sum);
    }
}

