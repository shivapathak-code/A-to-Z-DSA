package Stack.Questions;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplyPATH {
    public static String simplyPath(String s)
    {
        Deque<String> st = new ArrayDeque<>();
        String[] parts = s.split("/");

        for(String part : parts)
        {
            if(part.isEmpty())
            {
                continue;
            }
            if(part.equals("."))
            {
                continue;
            }
            if(part.equals("..") && st.isEmpty())
            {
                continue;
            }
            if(part.equals("..") && !st.isEmpty())
            {
                st.pop();
            }
            else
            {
                st.push(part);
            }
        }
        if(st.isEmpty())
        {
            return"/";
        }
        else {
            StringBuilder str = new StringBuilder();
            while (!st.isEmpty()) {
                str.append("/");
                str.append(st.removeLast());
            }
            return str.toString();
        }

    }
    public static void main(String[] args)
    {
        String s1 = "/home//foo/";
        String s2 = "/home/";
        String s3 = "/";

        System.out.println("final Answer -> "+simplyPath(s1));
        System.out.println("final Answer -> "+simplyPath(s2));
        System.out.println("final Answer -> "+simplyPath(s3));
    }
}
