package Stack.Questions.MonotonicStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dailytempreture {
    public static int[] dailyTemprature(int[] temprature)
    {
        int n = temprature.length;
        int ans[] = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for(int i = 0;i<n;i++)
        {
            while(!st.isEmpty() && temprature[i] > temprature[st.peek()])
            {
                int previousday = st.pop();
                ans[previousday] = i - previousday;
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {73,74,75,71,69,72,76,73};
        int ans[] = dailyTemprature(arr);
        for(int i = 0;i<ans.length;i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
}
