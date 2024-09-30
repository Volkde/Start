package lesson_07;

public class StringEquals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String  ("JaVa");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4 );

        boolean b1 = (str1 == str2);
        System.out.println(" (str1 == str2) " + b1);
        System.out.println( "(str1 == str2) " +  (str1 == str3));

        System.out.println(" (str1 == str4) " +  (str1 == str4));
    }
}
