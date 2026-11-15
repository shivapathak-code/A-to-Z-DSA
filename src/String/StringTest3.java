package String;

public class StringTest3 {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder(); // that is take 16 bytes total and you give size according to you so give size;
        // append method;
        sb.append("shiva");
        sb.append(" pathak");

        //System.out.println(sb);
        // insert method;
        sb.insert(2 , "h");
        //System.out.println(sb);

        //delete
        //sb.delete(0 , 3);
        //System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);
    }
}
