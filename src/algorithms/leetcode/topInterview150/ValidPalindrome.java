package algorithms.leetcode.topInterview150;

public class ValidPalindrome {

//    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
//    and removing all non-alphanumeric characters, it reads the same forward and backward.
//    Alphanumeric characters include letters and numbers.
//    Given a string s, return true if it is a palindrome, or false otherwise.

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder trimmedPhrase = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                trimmedPhrase.append(c);
            }
        }
        int length = trimmedPhrase.length();
        for (int i = length - 1; i >= 0; i--) {
            if (!(trimmedPhrase.charAt(i) == trimmedPhrase.charAt(length - i - 1))){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        String trimmedPhrase = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int length = trimmedPhrase.length();
        StringBuilder reversedPhrase = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            reversedPhrase.append(trimmedPhrase.charAt(i));
        }

        if (reversedPhrase.toString().equals(trimmedPhrase)) {
            return true;
        }
        return false;
    }
}
