package aslan_interviews.interview_prep_jan07;


import java.util.ArrayList;
import java.util.Arrays;

public class Java_Task {
    public static void main(String[] args) {

        String str1 = "The";
        String str2 = "AAbb";
        String str3 = "Hi-There";

        System.out.println(doubleCharsMethod(str1));
        System.out.println(doubleCharsMethod(str2));
        System.out.println(doubleCharsMethod(str3));
    }

    /**
     * This method allows user to return a string with duplicate characters from the passed String argument
     *
     * @param str
     * @return
     * @author Aslan
     */
    public static String doubleCharsMethod (String str){
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        String doubled = "";
        StringBuilder stringBuilder = new StringBuilder(doubled);

        strList.forEach(eachChar -> {
            stringBuilder.append("" + eachChar + eachChar);
        });
//
//        for (int i = 0; i < str.length(); i++) {
//            doubled += "" + str.charAt(i) + str.charAt(i);
//        }
        doubled = new String(stringBuilder);
        return doubled;
    }


    /*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
     */



    //Task01 (bool logic) -> https://codingbat.com/prob/p137742

    // or:

    //Task02 (String manipulation) -> https://codingbat.com/prob/p165312

    // or:

    //Task03 (Map) -> https://codingbat.com/prob/p115011

}
