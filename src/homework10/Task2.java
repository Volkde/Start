package homework10;

public class Task2 {
    public static void main(String[] args) {

        String[]  array =  {"One", "Two", "Three", "Twenty", "1", "45667"};
        String[]  minMax = copyOfArray(array);

        System.out.println(minMax[0]+" "+minMax[1]);

    }

    public static String[] copyOfArray(String[] stringArray1)  {

        String[] minMax = {stringArray1[0], stringArray1[0]};

        for(int i  = 0; i  < stringArray1.length; i++) {
            if (minMax[0].length() > stringArray1[i].length())  {
                minMax[0] = stringArray1[i];
            }

            if (minMax[1].length()  <  stringArray1[i].length()) {
                minMax[1]  =  stringArray1[i];
            }
        }
        return(minMax);


    }
}
