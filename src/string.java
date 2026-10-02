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

}
