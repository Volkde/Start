package homework05;

public class Task2 {
    public static void main(String[] args) {


       String str1 = "Python";
        String str2 =  "is";
        String str3 ="a";
        String str4 ="powerful";
        String str5 ="language";

        String concatWort = "";
        concatWort = concatWort.concat(str1).concat(" ").concat(str2).concat(" ").concat(str3).concat(" ").concat(str4).concat(" ").concat(str5);
        System.out.println(" " + concatWort);

        String spliterWort2 =  str1 + " " + str2  + " " + str3 + " "  + str4 + " "  +str5;
        System.out.println(spliterWort2);


        //Task3

//        str4 ="super";
         spliterWort2 =  str1 + " " + str2  + " " + str3 + " "  + str4 + " "  +str5;
         spliterWort2 = spliterWort2.replace("powerful", "super");
        System.out.println(spliterWort2);


    boolean cheakAge = spliterWort2.contains("age");
        System.out.println(cheakAge);



    }
}
