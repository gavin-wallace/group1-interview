package Eyads_package;

public class ReverseString {

    public static void main(String[] args) {
        String loop = "Loopcamp";
        System.out.println("Iterative: " + reverseStringIterative(loop));
        System.out.println("StringBuilder: " + reverseStringBuilder(loop));
        System.out.println("Recursive: " + reverseRecursively(loop));
    }

    public static String reverseStringIterative(String str){
        String reversed = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String reverseStringBuilder(String str){
        return new StringBuffer(str).reverse().toString();
    }

    public static String reverseRecursively(String str){
        if(str.isEmpty())
            return "";
        return str.charAt(str.length()-1) + reverseRecursively(str.substring(0, str.length()-1));
    }
}
