package Stack.Questions.MonotonicStack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class prevgreaterElement {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<arr.length;i++)
        {
            result.add(-1);
        }

        Deque<Integer> st = new ArrayDeque<>();
        // move left to right;
        int n = arr.length;
        for(int i = 0; i<= n-1;i++)
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
