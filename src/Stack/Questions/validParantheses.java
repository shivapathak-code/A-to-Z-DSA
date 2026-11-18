package Stack.Questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class validParantheses {
    public static boolean isValid(String str) {

        Deque<Character> st = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if (st.isEmpty()) {
                    return false;
                }

                if (ch == ')' && st.peek() != '(') {
                    return false;
                }
                else if (ch == '}' && st.peek() != '{') {
                    return false;
                }
                else if (ch == ']' && st.peek() != '[') {
                    return false;
                }
                else {
                    st.pop();
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {

        String str1 = "()";
        String str2 = "({[]})";
        String str3 = "(]";
        String str4 = "(()";
        String str5 = "())";

        System.out.println(str1 + " -> " + isValid(str1));
        System.out.println(str2 + " -> " + isValid(str2));
        System.out.println(str3 + " -> " + isValid(str3));
        System.out.println(str4 + " -> " + isValid(str4));
        System.out.println(str5 + " -> " + isValid(str5));
    }
}
