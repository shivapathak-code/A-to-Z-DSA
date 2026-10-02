public class string {

    // string jo hain immutable hoti hain to jab bi ase opertaion kerne hote hain to uske
    // hame use array main convert  kerna padta hain
    //like this;
//    public static void main(String[] args) {
//        String input = "hello";
//
//        char[] arr = input.toCharArray();
//
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            char temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//
//            left++;
//            right--;
//        }
//
//        System.out.println(new String(arr));
//    }

    // kabhi kabhi input ke according bi hame change kerna padta hain
    // jaise upper hamne string as a input li
    // to array main convert kerke sab array ke method use kiye hain
    // ab ham use ker hain ek list of string to hame ab jo
    // sab method list ke use kerne honge like as get set size ;

//    class Solution {
//        public void reverseString(List<Character> s) {
//
//            int left = 0;
//            int right = s.size() - 1;
//
//            while (left < right) {
//                Character temp = s.get(left);
//                s.set(left, s.get(right));
//                s.set(right, temp);
//
//                left++;
//                right--;
//            }
//        }
//    }


//    class Solution {
//        public boolean palindromeCheck(String s) {
//
//            String original = s;
//            StringBuilder rev = new StringBuilder();
//
//            if (s.isEmpty()) {
//                return true;
//            }
//
//            for (int i = s.length() - 1; i >= 0; i--) {
//                rev.append(s.charAt(i));
//            }
//
//            if (original.equals(rev.toString())) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }


    class Solution {
        public String largeOddNum(String s) {

            // Right se first odd digit find karo
            for (int i = s.length() - 1; i >= 0; i--) {

                char ch = s.charAt(i);
                // actual digit main convert kerta hain (ch - '0') ye kerta hain convert;

                if ((ch - '0') % 2 != 0) {

                    // Leading zeros remove karo
                    int start = 0;

                    while (start <= i && s.charAt(start) == '0') {
                        start++;
                    }

                    return s.substring(start, i + 1);
                }
            }

            return "";
        }
    }

}
