public class StringTest {
    public static void main(String[] args)
    {
        //String in java;
        String str1 = "Shiva"; // that is create in SCP menas String constant pool;
        String str2 = "Shiva";

        String str3 = new String("om");// that is create in Heap memory;
        String str4 = new String("om");

//        System.out.println(str1);
//        System.out.println(str2);

        System.out.println(str1 == str2); // reference type conversion ;

        System.out.println(str1.equals(str2));// content type conversion;

        System.out.println(str3.equals(str4));// content type conversion;

        System.out.println(str3 == str4); // reference type conversion ;



    }
}
