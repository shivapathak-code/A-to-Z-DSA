package Stack.Questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class longestvalidparenthesis {
    public static int longestValidParenthesis(String s)
    {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(-1);
        int maxlen = 0;

        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
            {
                st.push(i);
            }
            else
            {
                st.pop();
                if(st.isEmpty())
                {
                    // ye ek invlid case jahan ham reset ker dete pahle ki string ko remove kerke
                    st.push(i);
                }
                else
                {
                    // ye ek valid case jahan ham len calculate kerke use max len se comapre kertehain
                    int len = i-st.peek();
                    maxlen = Math.max(maxlen , len);
                }
            }
        }
        return maxlen;
    }
    public static void main(String[] args)
    {
        String s = ")()())";
        System.out.println(" longest valid parenthesis length -> "+longestValidParenthesis(s));
    }
}
