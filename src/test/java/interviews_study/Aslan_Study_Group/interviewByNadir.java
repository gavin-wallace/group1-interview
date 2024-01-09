package interviews_study.Aslan_Study_Group;

import java.util.Arrays;

public class interviewByNadir {
    public static void main(String[] args) {
        String[] arr = {"five", "ten", "eleven"};

        System.out.println(Arrays.toString(arrayWithMoreThan4Chars(arr)));

    }

    /**
     * this method is taking a string array as a param and removes the ones with less than and equal to 4 chars
     * @param String[] arr
     * @return String[]
     */
    public static String[] arrayWithMoreThan4Chars (String[] arr){
        String[] modified = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()<=4) {
                continue;
            }else {
                modified[i] = arr[i];
            }

        }

        return modified;
    }
}
