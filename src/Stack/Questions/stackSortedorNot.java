package Stack.Questions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class stackSortedorNot {
    public static boolean isSorted(Stack<Integer> st)
    {
        if(st.size()<=1)
        {
            return true;
        }
        //ek  case hame solve kerna haain bakki recursion sambal lega
        int prevElement = st.peek();
        st.pop();
        int currentElement = st.peek();
        boolean ekcasekaAns = (prevElement <= currentElement);

        //ab recursion ka ansewer ab recusion sambal lega yahan se;
        boolean recursionkaAns = isSorted(st);
        st.push(prevElement);

        boolean finalAns = ekcasekaAns && recursionkaAns;
        return finalAns;
    }
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(3);
        st.push(5);
        st.push(1);
        System.out.println("stack is sorted or not--> "+ isSorted(st));
    }
}
