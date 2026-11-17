package Stack.Questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class middleElement {

    static void printMiddlElement(Deque<Integer> st , int count , int size)
    {
        // base case
        if(count == size/2)
        {
            int middleElemnt = st.peek();
            System.out.println("middle element of stack "+middleElemnt);
            return;
        }
        // ek case ham solve karenge baki recusion sambhal lega;
        st.pop();
        count++;
        printMiddlElement(st , count , size);
    }
    public static void main(String[] args)
    {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);

        int count = 0;
        int size = st.size();
        printMiddlElement(st ,count , size );
    }
}
