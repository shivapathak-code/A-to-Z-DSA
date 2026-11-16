package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

// stack is linear data structure that is follow the LIFO
// ordering and perform the operations like
// push , pop , peek , isEmpty , size;
public class demo1 {
    public static void main(String[] args)
    {
        Deque<Integer> st = new ArrayDeque<>();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("stack element "+ st);

        st.pop();
        System.out.println("top element of stack "+st.peek());

        System.out.println("size of stack "+st.size());

        System.out.println("Stack is empty "+st.isEmpty());

        st.pop();
        st.pop();
        System.out.println("Stack is empty "+st.isEmpty());

    }
}
