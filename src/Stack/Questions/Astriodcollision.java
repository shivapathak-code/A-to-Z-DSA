package Stack.Questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class Astriodcollision {
    public static int[] astroidCollision(int[] astroid)
    {
        Deque<Integer> st = new ArrayDeque<>();
        for(int ast : astroid)
        {
            if(ast > 0)
            {
                st.push(ast);
            }
            else {

                if(st.isEmpty())
                {
                    st.push(ast);
                }
                else if(!st.isEmpty() && st.peek() < 0)
                {
                    st.push(ast);
                }
                else {
                    boolean destroyed = false;

                    while(!st.isEmpty() && ast < 0 && st.peek() > 0){
                        if(st.peek() < -ast)
                        {
                            st.pop();
                            continue;
                        }
                        else if(st.peek() > -ast)
                        {
                            destroyed = true;
                            break;
                        }
                        else
                        {
                            st.pop();
                            destroyed = true;
                            break;
                        }
                    }
                    if(destroyed == false)
                    {
                        st.push(ast);
                    }
                }
            }
        }
        int ans[] = new int[st.size()];
        for(int i = st.size()-1;i>=0;i--)
        {
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = {10 , 2 , -5};
        int ans[] = astroidCollision(arr);
        for(int i = 0;i<ans.length;i++)
        {
            System.out.println(ans[i] + " ");
        }
    }
}
