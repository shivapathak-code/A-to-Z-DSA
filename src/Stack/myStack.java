package Stack;

public class myStack {
    private int[] arr;
    private int capacity;
    private int top;

    public myStack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }
    public void push(int value)
    {
        if(top == capacity-1)
        {
            System.out.println("not push any element because stack is overflow");
            return;
        }
        else
        {
            top++;
            arr[top] = value;
        }
    }
    public void pop()
    {
        if(top == -1)
        {
            System.out.println("not pop any element because stack is underflow");
            return;
        }
        else {
            arr[top] = -1;
            top--;
        }

    }
    public int peek()
    {
         if(top == -1)
         {
             System.out.println("there is no element in stack");
             return -1;
         }
         else {
             return arr[top];
         }
    }
    public int getsize()
    {
        return top+1;
    }
    public int getCapacity()
    {
        return this.capacity;
    }
    public boolean checkEmpty()
    {
        if (top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void printStack(myStack st)
    {
        while(!st.checkEmpty())
        {
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }

    public static void main(String[] args)
    {
        myStack st = new myStack(3);
        st.push(10);
        //System.out.println("size of stack "+st.getsize());
        st.push(20);
        //System.out.println("size of stack "+st.getsize());
        st.push(30);
        printStack(st);
        //System.out.println("size of stack "+st.getsize());
//        st.push(40);
//        st.pop();
//        System.out.println("size of stack "+st.getsize());
//        st.pop();
//        System.out.println("size of stack "+st.getsize());
//        st.pop();
//        System.out.println("size of stack "+st.getsize());
//        st.pop();
//        System.out.println("size of stack "+st.getsize());
//        System.out.println(st.checkEmpty());
        //System.out.println(st.peek());

    }
}
