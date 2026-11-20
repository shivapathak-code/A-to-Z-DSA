package Stack.Questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class Countreversal {
    public static int countReversal(String s)
    {
        // optimise approach use without stack use only varilables;
        if(s.length()%2 == 1)
        {
            return -1;
        }
        int open  = 0;
        int close = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == '}' && open > 0)
            {
                open--;
            }
            else
            {
                if(ch == '{')
                {
                    open++;
                }
                else if(ch == '}')
                {
                    close++;
                }
            }
        }
        if(open %2 == 0)
        {
            return (open/2)+(close/2);
        }
        else
        {
            return (close -1)/2+2+(open-1)/2;
        }





















//        if(s.length()%2 == 1)
//        {
//            return -1;
//        }
//        Deque<Character> st = new ArrayDeque<>();
//        for(char ch : s.toCharArray())
//        {
//            if(ch == '}'&& !st.isEmpty() && st.peek() == '{')
//            {
//                st.pop();
//            }
//            else
//            {
//                st.push(ch);
//            }
//        }
//        int open = 0;
//        int close = 0;
//        while(!st.isEmpty())
//        {
//            if(st.peek() == '{')
//            {
//                open++;
//            }
//            else
//            {
//                close++;
//            }
//            st.pop();
//        }
//        if(open %2 == 0)
//        {
//            return (open/2)+(close/2);
//        }
//        else
//        {
//            return (close -1)/2+2+(open-1)/2;
//        }
    }
    public static void main(String[] args)
    {
        String s = "{}}{";
        System.out.println("total count -> "+countReversal(s));
    }
}
