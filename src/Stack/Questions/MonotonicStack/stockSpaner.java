package Stack.Questions.MonotonicStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class stockSpaner {
    private Deque<int[]> st;
//   [0] = price;
//   [1] = span;
    public stockSpaner()
    {
        st = new ArrayDeque<>();
    }
    public int next(int price)
    {
        int span = 1;

        while(!st.isEmpty() && st.peek()[0] <= price)
        {
            span = span + st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price, span});
        return span;
    }
    public static void main(String[] args) {
        stockSpaner obj = new stockSpaner();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        for (int price : prices) {
            System.out.print(obj.next(price) + " ");
        }
    }
}
