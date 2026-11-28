package Stack.Questions.MonotonicStack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class nextLargerElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
    ArrayList<Integer> result = new ArrayList<>();

                        for(int i=0; i<arr.length;i++)
    {
        result.add(-1);
    }

    Deque<Integer> st = new ArrayDeque<>();
    // move right to left;
    int n = arr.length;
                        for(int i = n-1; i>= 0;i--)
    {

        int currIndex = i;

        while(!st.isEmpty() && arr[st.peek()] <= arr[currIndex])
        {
            st.pop();
        }

        if(!st.isEmpty())
        {
            result.set(i , arr[st.peek()]);
        }

        st.push(currIndex);
    }
                        return result;

}
}
