package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

// stack is linear data structure that is follow the LIFO
// ordering and perform the operations like
// push , pop , peek , isEmpty , size;


// interview question
//The statement Deque<Integer> st = new ArrayDeque<>(); creates an empty stack
//        that stores Integer values. When we execute st.push(null), we are trying to insert a null
//        value at the top of the stack. However, ArrayDeque does not allow null elements because it uses null internally
//        to represent the absence of an element, which helps it distinguish between an empty deque and a deque
//        containing an element. Therefore, inserting null into an ArrayDeque throws a NullPointerException.
//
//        If we want to insert null into a deque, we can use LinkedList instead because LinkedList
//        allows null elements. For example:
            //Deque<Integer> st = new LinkedList<>();
           //st.push(null); // Allowed
public class demo1 {
    public static void main(String[] args)
    {
        Deque<Integer> st = new ArrayDeque<>();

        st.push(10);
//        st.push(20);
//        st.push(30);

        System.out.println("stack element "+ st);

//        st.pop();
//        System.out.println("top element of stack "+st.peek());
//
//        System.out.println("size of stack "+st.size());
//
//        System.out.println("Stack is empty "+st.isEmpty());
//
//        st.pop();
//        st.pop();
//        System.out.println("Stack is empty "+st.isEmpty());

    }
}
