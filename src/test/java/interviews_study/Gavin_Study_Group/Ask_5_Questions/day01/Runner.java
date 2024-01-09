package interviews_study.Gavin_Study_Group.Ask_5_Questions.day01;

public class Runner {
    public static void main(String[] args) {

        Child obj1 = new Child();

        // static methods CAN NOT be called with an object
        Parent.method1();
        //obj1.method1();

        // but static variables CAN BE called by both Class and Object name
        System.out.println(obj1.name);
        System.out.println(Parent.name);

    }
}
