package Stack.Questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class longestvalidparenthesis {
    public static int longestValidParenthesis(String s)
    {

        int open = 0;
        int close  =0;
        int maxlen = 0;
 // left to right travel;
        for (int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                open++;
            }
            else
            {
                close++;
            }

            if(close > open)
            {
                open = 0;
                close = 0;
            }
            else if(open == close)
            {
                maxlen = Math.max(maxlen , 2*close);
            }
        }
        open = 0;
        close = 0;

        // right to left travel;
        for (int i = s.length()-1;i>0;i--)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                open++;
            }
            else
            {
                close++;
            }

            if(open > close)
            {
                open = 0;
                close = 0;
            }
            else if(open == close)
            {
                maxlen = Math.max(maxlen , 2*open);
            }
        }
        return maxlen;
























//        Deque<Integer> st = new ArrayDeque<>();
//        st.push(-1);
//        int maxlen = 0;
//
//        for(int i = 0;i<s.length();i++)
//        {
//            char ch = s.charAt(i);
//            if(ch == '(')
//            {
//                st.push(i);
//            }
//            else
//            {
//                st.pop();
//                if(st.isEmpty())
//                {
//                    // ye ek invlid case jahan ham reset ker dete pahle ki string ko remove kerke
//                    st.push(i);
//                }
//                else
//                {
//                    // ye ek valid case jahan ham len calculate kerke use max len se comapre kertehain
//                    int len = i-st.peek();
//                    maxlen = Math.max(maxlen , len);
//                }
//            }
//        }
//        return maxlen;
  }
    public static void main(String[] args)
    {
        String s = ")()())";

        String s1 = "))())))()";
        System.out.println(" longest valid parenthesis length -> "+longestValidParenthesis(s1));
    }
}
