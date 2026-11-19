package Stack.Questions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class validString {
    public static boolean ValidString(String s)
    {
        Deque<Character> st = new ArrayDeque<>();
        for(char ch : s.toCharArray())
        {
            if(ch == 'a' || ch == 'b')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                if(st.peek() != 'b')
                {
                    return false;
                }
                 st.pop();
                if(st.peek() != 'a')
                {
                    return false;
                }
                st.pop();
            }
        }
        if(st.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        String s1 = "abcabc";
        String s2= "ababcc";
        String s3= "abccba";
        System.out.println("string is valid or not -> "+ ValidString(s1));
        System.out.println("string is valid or not -> "+ ValidString(s2));
        System.out.println("string is valid or not -> "+ ValidString(s3));
    }
}
