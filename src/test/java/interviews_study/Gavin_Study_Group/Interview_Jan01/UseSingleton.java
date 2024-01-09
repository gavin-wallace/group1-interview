package interviews_study.Gavin_Study_Group.Interview_Jan01;

public class UseSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);
        System.out.println(Singleton.getSingleton());
    }
}
