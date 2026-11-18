package Stack.Questions;

import java.util.Stack;

public class Sortedinsert {
    public static void sortedInsert(Stack<Integer> st , int X)
    {
        if(st.isEmpty())
        {
            st.push(X);
            return;
        }
        int topvalue = st.peek();
        if(topvalue < X)
        {
            st.pop();
            sortedInsert(st , X);
            st.push(topvalue);
        }
        else
        {
            st.push(X);
            return;
        }
    }

    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(2);
        st.push(1);
        sortedInsert(st , 3);
        System.out.println(st);

    }

}
