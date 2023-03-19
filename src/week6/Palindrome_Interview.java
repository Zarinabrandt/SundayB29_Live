package week6;

public class Palindrome_Interview {
    public static void main(String[] args) {

        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("hello"));

    }

    public static boolean isPalindrome(String str){

        for (int begin = 0, end = str.length() -1; begin < str.length() /2; begin++, end--){
           // str.charAt(begin);
            //str.charAt(end);

            if (str.charAt(begin) != str.charAt(end)){ //the characters are different
                return false;
            }
        }

        return true;

    }


}
