package interviews_study.Gavin_Study_Group.Interview_December.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Java_Questions_Day_01 {
    public static void main(String[] args) {

        String str = "aslan";
        String reversedStr;
        ArrayList<String> reversedList = new ArrayList<>(Arrays.asList(str.split("")));
        Collections.reverse(reversedList);
        System.out.println(reversedList);

        reversedStr = String.valueOf(reversedList);
        System.out.println(reversedStr);


/*
1. What is the output of below method once called:

    private static int return_A_Number(){
        try {
            return (4 > 5)? 4 : 3;
        } catch (Exception e) {
            return 4;
        } finally {
            return 5;
        }
    }

    2. Write a simple HelloWorld code and run it without using InteliJ

    3. Reverse a string w/o using any of for/doWhile or while loops

    3. What are the differences between final, finally, and finalize

    4. Tell me about throw vs throws. what about try/catch vs throws?

    5. What is the difference between Collection and Collections?

    6. When would you use Array, ArrayList, or LinkedList?

    7. Where do you use Collection in your framework?













 */

    }


}
