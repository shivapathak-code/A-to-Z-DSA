package String;

import java.net.SocketOption;
import java.nio.charset.StandardCharsets;

// String methods in java;
public class StringTest2 {
    public static void main(String[] args)
    {
        String s1 = new String("Shiva");
        String s2 = new String("SHIVA");
        // length and emptiness;
//        System.out.println(s1.length());
//        System.out.println(s1.isEmpty());//false;
//        System.out.println(s1.isBlank());//false;

        // character access;
//        System.out.println(s1.charAt(2));
//        char[] arr = s1.toCharArray();
//        System.out.println(arr);

        //Comparision;
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
        // Lexograpical order --->like dictionary;
        //System.out.println(s1.compareTo(s2)); // that is give three type of values like -ve , 0 , +ve;
        // then first value is less than second value -ve
        // then first value is grater than second value +ve
        // then first value is equal than second value 0
        // find value of a string using ascii values;

        // Searching;
//        System.out.println(s1.contains("iva"));
//        System.out.println(s1.indexOf("a"));

        //extraction // and substring
//        System.out.println(s1.substring(0 , 3));
        //System.out.println(s1.trim()); // remove spaces from start to end;

        // split;
//        String s3 = "shiva-mayank-om";
//        String[] arr1 = s3.split("-");
//
//        for(String s : arr1)
//        {
//            System.out.println(s);
//        }

        //join methods;
        //System.out.println(String.join("-" , "a" ,"b" ,"c"));

        // conversion
//        byte[] brr = s1.getBytes();
//        for(byte i : brr)
//        {
//            System.out.println(i);
//        }

        //advance method;
//        String s5 = new String("hello");
////        String s6 = s5;
//        String s6 = s5.intern(); // ye push ker deta hain string pool mein;
//
//        System.out.println(s5 == s6);

        // formate;

        String s = "shiva";
        int age = 19;

        System.out.println(String.format("hello my name %s , and my age %s" ,s , age));


    }
}
