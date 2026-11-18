
package Stack.Questions;

import java.util.Stack;

public class insertAtBottom {

    static void solve(Stack<Integer> st, int value) {

        // Base case
        if (st.empty()) {
            st.push(value);
            return;
        }

        // Store and remove the top element
        int topvalue = st.peek();
        st.pop();

        // Recursive call
        solve(st, value);

        // Restore the removed element
        st.push(topvalue);
    }

    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        solve(st, x);
        return st;
    }

    public static void main(String[] args) {

        insertAtBottom obj = new insertAtBottom();

        Stack<Integer> st = new Stack<>();

        st.push(4);
        st.push(5);
        st.push(6);

        Stack<Integer> ans = obj.insertAtBottom(st, 10);

        System.out.println(ans);
    }
}
