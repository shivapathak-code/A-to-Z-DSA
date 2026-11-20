package Stack.Questions;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAllAdjecent {
    public  static String removeAllAdjecent(String s)
    {
        Deque<Character> st = new ArrayDeque<>();
        for(char ch :s.toCharArray() )
        {
            if(!st.isEmpty())
            {
                if(st.peek() == ch)
                {
                    st.pop();
                }
                else
                {
                    st.push(ch);
                }
            }
            else
            {
                st.push(ch);
            }
        }

        StringBuilder str = new StringBuilder();
        while(!st.isEmpty())
        {
            str.append(st.peek());
            st.pop();
        }
        return str.reverse().toString();
    }
    public static void main(String[] args)
    {
        String s = "abbaca";
        String s1 = "abccba";

        String ans = removeAllAdjecent(s1);
        System.out.println("Answer String like this -> "+ ans);
    }
}
