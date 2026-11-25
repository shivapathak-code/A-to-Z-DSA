
package Stack.Questions;

public class NstackinArray {

    private int[] arr;
    private int[] top;
    private int[] next;
    private int freespot;

    public NstackinArray(int N, int S) {

        freespot = 0;

        top = new int[N];
        arr = new int[S];
        next = new int[S];

        for (int i = 0; i < N; i++) {
            top[i] = -1;
        }

        for (int i = 0; i < S - 1; i++) {
            next[i] = i + 1;
        }

        next[S - 1] = -1;
    }

    public boolean push(int stackNum, int value) {

        if (freespot == -1) {
            return false;
        }

        int index = freespot;

        arr[index] = value;

        freespot = next[index];

        int stackIndex = stackNum - 1;

        next[index] = top[stackIndex];

        top[stackIndex] = index;

        return true;
    }

    public int pop(int stackNum) {

        int stackIndex = stackNum - 1;

        if (top[stackIndex] == -1) {
            return -1;
        }

        int index = top[stackIndex];

        int poppedElement = arr[index];

        top[stackIndex] = next[index];

        next[index] = freespot;

        freespot = index;

        return poppedElement;
    }

    public int top(int stackNum) {

        int stackIndex = stackNum - 1;

        if (top[stackIndex] == -1) {
            return -1;
        }

        return arr[top[stackIndex]];
    }

    public boolean isEmpty(int stackNum) {

        int stackIndex = stackNum - 1;

        return top[stackIndex] == -1;
    }

    public static void main(String[] args) {

        NstackinArray st = new NstackinArray(3, 10);

        st.push(1, 10);
        st.push(1, 20);

        st.push(2, 30);
        st.push(2, 40);

        st.push(3, 50);

        System.out.println("Top of Stack 1: " + st.top(1));
        System.out.println("Top of Stack 2: " + st.top(2));
        System.out.println("Top of Stack 3: " + st.top(3));

        System.out.println("Pop Stack 1: " + st.pop(1));
        System.out.println("Pop Stack 2: " + st.pop(2));

        System.out.println("Stack 1 Empty: " + st.isEmpty(1));
        System.out.println("Stack 3 Empty: " + st.isEmpty(3));
    }
}
