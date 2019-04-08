package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> resultList = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                resultList.add(string.substring(i, j));
            }
        }
        return resultList.toArray(new String[resultList.size()]);

        //        ArrayList<String> returnStrings = new ArrayList<>();
//        String temp = "";
//
//        for (int i = 0; i < string.length(); i++) {
//            for (int j = i+1; j <= string.length(); j++) {
//                returnStrings.add(string.substring(i, j));
//            }
//        }
//        String[] outputArray = new String[returnStrings.size()];
//        outputArray = returnStrings.toArray(outputArray);
//        return outputArray;

    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> set = new HashSet<>();

        String[] str2Arr = StringEvaluator.getAllSubstrings(string2);

        List<String> result = new ArrayList<>();

        for (int i = 0; i < string1.length(); i++) {
            for (int j = i + 1; j <= string1.length(); j++) {
                set.add(string1.substring(i, j));
            }
        }

        for (String str : str2Arr) {
            if (set.contains(str)) {
                result.add(str);
            }
        }
        String[] outputArray = new String[result.size()];
        outputArray = result.toArray(outputArray);
        return outputArray;
    }




        //        String[] str1Arr = StringEvaluator.getAllSubstrings(string1);
//        String[] str2Arr = StringEvaluator.getAllSubstrings(string2);
//        ArrayList<String> commonList = new ArrayList<>();
//
//        for (int i = 0; i < str1Arr.length; i++) {
//            for (int j = 0; j < str2Arr.length; j++) {
//                if (str1Arr[i] == str2Arr[j]) {
//                    commonList.add(str1Arr[i]);
//                }
//            }
//        }
//
//            String[] outputArray = new String[commonList.size()];
//            outputArray = commonList.toArray(outputArray);
//
//        return outputArray;



    public static String getLargestCommonSubstring(String string1, String string2) {
        String longest = "";
        Integer lenInt = 0;
        String[] commonSubsArray = StringEvaluator.getCommonSubstrings(string1, string2);

        for(String str : commonSubsArray) {
            if(str.length() > lenInt) {
                longest = str;
                lenInt = str.length();
            }
        }

        return longest;
    }
}
