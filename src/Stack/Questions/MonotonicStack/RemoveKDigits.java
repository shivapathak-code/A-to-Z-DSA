package Stack.Questions.MonotonicStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveKDigits {

    public String removeKdigits(String num, int k) {

        Deque<Character> st = new ArrayDeque<>();

        for (int i = 0; i < num.length(); i++) {

            char ch = num.charAt(i);

            // Remove larger digits from stack
            while (!st.isEmpty() &&
                    k > 0 &&
                    st.peek() > ch) {

                st.pop();
                k--;
            }

            st.push(ch);
        }

        // If k is still greater than 0
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Build result in correct order
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.removeLast());
        }

        // Remove leading zeros
        int i = 0;

        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }

        String result = sb.substring(i);

        return result.isEmpty() ? "0" : result;
    }

    public static void main(String[] args) {

        RemoveKDigits obj = new RemoveKDigits();

        String num = "1432219";
        int k = 3;

        System.out.println(obj.removeKdigits(num, k));
    }
}
