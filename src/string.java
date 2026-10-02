public class string {

    // string jo hain immutable hoti hain to jab bi ase opertaion kerne hote hain to uske
    // hame use array main convert  kerna padta hain
    //like this;
    public static void main(String[] args) {
        String input = "hello";

        char[] arr = input.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));
    }

    // kabhi kabhi input ke according bi hame change kerna padta hain
    // jaise upper hamne string as a input li
    // to array main convert kerke sab array ke method use kiye hain
    // ab ham use ker hain ek list of string to hame ab jo
    // sab method list ke use kerne honge like as get set size ;

    class Solution {
        public void reverseString(List<Character> s) {

            int left = 0;
            int right = s.size() - 1;

            while (left < right) {
                Character temp = s.get(left);
                s.set(left, s.get(right));
                s.set(right, temp);

                left++;
                right--;
            }
        }
    }

}
