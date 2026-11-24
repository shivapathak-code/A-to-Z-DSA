package Stack.Questions.MonotonicStack;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayDeque;
import java.util.Deque;

public class celebraity {
    public static int findCelebraity(int[][] M , int n)
    {
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = 0;i<n;i++)
        {
            st.push(i);
        }

        // stack elimation
        while(st.size() >=2)
        {
            int a = st.pop();
            int b = st.pop();

            if(M[a][b] == 1)
            {
                // matlb a b ko nhi janta hain ;
                st.push(b);
            }
            else
            {
                // M[a][b] == 0
                // to a b ko janta hain
                st.push(a);
            }
        }

        int celeIndex = st.pop();
// yahan ans ana chaiye 0 se comapre to celeb kisi ko nahi janata hain;
        for(int i = 0;i<n;i++)
        {
            if(M[celeIndex][i] == 1)
            {
                return -1;
            }
        }
        // yahan ans ana chaiye 1 se compare to celeb ko sab jante hain
        for(int i = 0;i<n;i++)
        {
            if(i != celeIndex) {
                if (M[i][celeIndex] == 0) {
                    return -1;
                }
            }
        }
        return celeIndex;
    }
    public static void main(String[] args)
    {
        int arr[][] = {{0,1,0},{0,0,0},{1,1,0}};
        int ans = findCelebraity(arr , 3);
        System.out.println(ans);
    }
}
