package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        ArrayList<String> temporal = new ArrayList<>();
        String [] allSubs = StringEvaluator.getAllSubstrings(string);

        for(String str : allSubs) {
            if(PalindromeEvaluator.isPalindrome(str)) {
                temporal.add(str);
            }
        }
        String[] outputArray1 = new String[temporal.size()];
        outputArray1 = temporal.toArray(outputArray1);
        return outputArray1;
    }

    public static Boolean isPalindrome(String string) {
        String reverse = new StringBuffer(string).reverse().toString();
        if (string.equals(reverse)) {
            return true;
        }
        return false;
    }

    public static String reverseString(String string) {
        StringBuilder reversed = new StringBuilder(string);
        return reversed.reverse().toString();
    }
}
