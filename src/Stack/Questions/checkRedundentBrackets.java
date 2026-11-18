package Stack.Questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class checkRedundentBrackets {
    public static boolean checkRedundancy(String s) {

        Deque<Character> st = new ArrayDeque<>();

        for(char ch : s.toCharArray())
        {
            if(ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                st.push(ch);
            }
            else if( ch == ')')
            {
                boolean operatorFound = false;
                while(!st.isEmpty())
                {
                    char temp = st.peek();
                    if(temp == '+' || temp == '-' || temp == '*' || temp == '/')
                    {
                        operatorFound = true;
                    }
                    if(ch == ')' && temp == '(')
                    {
                        st.pop();
                        break;
                    }
                    st.pop(); // yahan se character pop ho raha hain ;

                }
                if(operatorFound == false)
                {
                    // we found redundent barckets;
                    return true;
                }

            }
        }
        return false;

    }
    public static void main(String[] args)
    {
        String str1 = "((a+b))";
        String str2 = "(a+b+(c+d))";
        String str3 = "(a+b)";

        System.out.println(str1 + " -> " + checkRedundancy(str1));
        System.out.println(str2 + " -> " + checkRedundancy(str2));
        System.out.println(str3 + " -> " + checkRedundancy(str3));
    }
}
