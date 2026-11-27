package Stack.Questions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class nextsmallerelement {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {

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

            int curr = arr[i];

            while(!st.isEmpty() && st.peek() >= curr)
            {
                st.pop();
            }

            if(!st.isEmpty())
            {
                result.set(i , st.peek());
            }

            st.push(curr);
        }
        return result;

    }
}
