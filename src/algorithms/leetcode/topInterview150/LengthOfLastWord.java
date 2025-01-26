package algorithms.leetcode.topInterview150;

import java.util.List;

public class LengthOfLastWord {

//    Given a string s consisting of words and spaces,
//    return the length of the last word in the string.
//    A word is a maximal
//            substring
//    consisting of non-space characters only.

    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
//        List<String> words = List.of(s.split(" "));
//        return words.getLast().length();

        int length = 0;
         for (int i = s.length() - 1; i >= 0; i--){
             if (s.charAt(i) != ' '){
                 length++;
             }else {
                 if (length > 0){
                     return length;
                 }
             }
         }
         return length;
    }
}
