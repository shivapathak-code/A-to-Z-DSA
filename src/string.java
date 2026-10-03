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


//    class Solution {
//        public String largeOddNum(String s) {
//
//            // Right se first odd digit find karo
//            for (int i = s.length() - 1; i >= 0; i--) {
//
//                char ch = s.charAt(i);
//                // actual digit main convert kerta hain (ch - '0') ye kerta hain convert;
//
//                if ((ch - '0') % 2 != 0) {
//
//                    // Leading zeros remove karo
//                    int start = 0;
//
//                    while (start <= i && s.charAt(start) == '0') {
//                        start++;
//                    }
//
//                    return s.substring(start, i + 1);
//                }
//            }
//
//            return "";
//        }
//    }

//    class Solution {
//        public String common(String s1 , String s2)
//        {
//            int n = Math.min(s1.length() , s2.length());
//            StringBuilder sb = new StringBuilder();
//
//            for(int i = 0;i<n;i++)
//            {
//                if(s1.charAt(i) == s2.charAt(i))
//                {
//                    sb.append(s1.charAt(i));
//                }
//                else
//                {
//                    break;
//                }
//            }
//            return sb.toString();
//
//        }
//        public String longestCommonPrefix(String[] str) {
//            String ans = str[0];
//
//            for(int i = 1;i<str.length;i++)
//            {
//                ans  = common(ans , str[i]);
//            }
//            return ans;
//        }
//    }

//    class Solution {
//        public boolean isomorphicString(String s, String t) {
//
//            if(s.length() != t.length())
//            {
//                return false;
//            }
//            HashMap<Character ,Character> mp1 = new HashMap<>();
//            HashMap<Character ,Boolean> mp2 = new HashMap<>();
//
//            int n = s.length();
//            for(int i = 0;i<n;i++)
//            {
//                char ch1 = s.charAt(i);
//                char ch2 = t.charAt(i);
//
//                if(mp1.containsKey(ch1) == true)
//                {
//                    if(mp1.get(ch1) != ch2)
//                    {
//                        return false;
//                    }
//                }
//                else
//                {
//                    if((mp2.containsKey(ch2) == true))
//                    {
//                        return false;
//                    }
//                    else
//                    {
//                        mp1.put(ch1 , ch2);
//                        mp2.put(ch2 , true);
//                    }
//                }
//
//            }
//            return true;
//        }
//    }
public static void main(String[] args) {
    String s = "hello";

    System.out.println(reverseString(0, s));
}

    public static StringBuilder reverseString(int i, String s) {
        if (i >= s.length()) {
            return new StringBuilder();
        }

        StringBuilder rev = reverseString(i + 1, s);
        rev.append(s.charAt(i));

        return rev;
    }

}
