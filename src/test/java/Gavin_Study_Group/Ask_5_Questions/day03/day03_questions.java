package Gavin_Study_Group.Ask_5_Questions.day03;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Q1: write a method that takes a map with generic data type as a param, and prints out each key and value of it
Q2: when you did u work with a difficult team member and how did u handle it?
Q3: how do you apply Abstraction in automation?
Q4: explain bug Life cycle
Q5: How Do You Stay Updated with the Latest Trends and Technologies in Testing and Development?
Q6: Describe a Time When You Successfully Contributed to Improving the Testing Process in Your Team.
*/

public class day03_questions {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new LinkedHashMap<>();
        myMap.put(1, "Aslan");

        Integer[] keys = {1, 2, 3, 4, 5};
        String[] values = {"Aslan", "Sam", "Bobby", "Floppy"};
        myMap.replace(1, "Johny");
        System.out.println(myMap);
    }

    public static <T, K> void method(Map<T, K> map){
        for (Map.Entry <T, K> eachEntry : map.entrySet()) {
            System.out.println(eachEntry.getKey());
            System.out.println(eachEntry.getValue());
        }
    }
}





























