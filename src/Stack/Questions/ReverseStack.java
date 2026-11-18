package Stack.Questions;

import java.util.Stack;

public class ReverseStack {
    static void insertAtBottom(Stack<Integer> st , int value)
    {
        if(st.empty())
        {
            st.push(value);
            return;
        }

        int topvalue = st.peek();
        st.pop();

        insertAtBottom(st , value);
        st.push(topvalue);
    }
    public static void reverseStack(Stack<Integer> st) {

        if(st.empty())
        {
            return;
        }

        int topvalue = st.peek();
        st.pop();
        reverseStack(st);
        insertAtBottom(st , topvalue);

    }
    public static void main(String[] args)
    {
        ReverseStack obj = new ReverseStack();

        Stack<Integer> st = new Stack<>();

        st.push(4);
        st.push(5);
        st.push(6);


        reverseStack(st);

        System.out.println(st);
    }
}
