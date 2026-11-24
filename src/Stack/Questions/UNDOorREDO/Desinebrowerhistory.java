package Stack.Questions.UNDOorREDO;

import java.util.ArrayDeque;
import java.util.Deque;

public class Desinebrowerhistory {
    Deque<String> currhistory ;
    Deque<String> forwardhistory;
    public Desinebrowerhistory(String homepage)
    {
        currhistory = new ArrayDeque<>();
        forwardhistory = new ArrayDeque<>();
        currhistory.push(homepage);
    }
    public void visit(String url)
    {
        currhistory.push(url);
        while(!forwardhistory.isEmpty())
        {
            forwardhistory.pop();
        }
    }
    public String back(int steps)
    {
        while(steps > 0)
        {
            if(currhistory.size() > 1)
            {
                String backTab = currhistory.pop();
                forwardhistory.push(backTab);
            }
            else
            {
                break;
            }
            steps--;
        }
        return currhistory.peek();
    }
    public String forward(int steps)
    {
        while(steps > 0)
        {
            if(forwardhistory.size()>0)
            {
                String forwardTab = forwardhistory.pop();
                currhistory.push(forwardTab);
            }
            else
            {
                break;
            }
            steps--;
        }
        return currhistory.peek();
    }
    public static void main(String[] args) {

        Desinebrowerhistory browser = new Desinebrowerhistory("google.com");

        browser.visit("youtube.com");
        browser.visit("facebook.com");
        browser.visit("instagram.com");

        System.out.println("Current Page: " + browser.currhistory.peek());

        System.out.println("Back 1: " + browser.back(1));
        System.out.println("Back 1: " + browser.back(1));

        System.out.println("Forward 1: " + browser.forward(1));

        browser.visit("linkedin.com");

        System.out.println("Current Page: " + browser.currhistory.peek());

        System.out.println("Back 2: " + browser.back(2));

        System.out.println("Forward 2: " + browser.forward(2));
    }

}
