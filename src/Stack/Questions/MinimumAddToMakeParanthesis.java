package Stack.Questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinimumAddToMakeParanthesis {
    public static int minimumAddBrackets(String s)
    {
        Deque<Character> st = new ArrayDeque<>();
        int AdditionBrackets = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    AdditionBrackets++;
                }
                else
                {
                    st.pop();
                }
            }
        }
        // final answer yahan ayege Addidtion se
        int finalAnswer = AdditionBrackets + st.size();
        return finalAnswer;
    }
    public static void main(String[] args)
    {
        String s1 = "()((()";
        String s2 = "((())))";
        String s3 = "()())))";

        System.out.println("Howmuch brackets to need create valid paranthesis -> "+ minimumAddBrackets(s1));
        System.out.println("Howmuch brackets to need create valid paranthesis -> "+ minimumAddBrackets(s2));
        System.out.println("Howmuch brackets to need create valid paranthesis -> "+ minimumAddBrackets(s3));


    }
}
