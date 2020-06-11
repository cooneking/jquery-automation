package Day1;

import java.sql.SQLOutput;

public class StringPractice {
    public static void main(String[] args) {

        //StringPractice stringPractice = new StringPractice();
        //System.out.println(stringPractice.frontBack("S"));

       // System.out.println(frontBack("hpoqwejas"));
       // System.out.println(backAround("Sophia"));
       // System.out.println(or35(80));
        System.out.println(front22("sofofo"));

    }

    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String front = str.substring(0, 1);
        String end = str.substring(str.length() - 1);
        String mid = str.substring(1, str.length() - 1);

        return end + mid + front;

    }
    public static String backAround(String str){
        String aki = str.substring(str.length()-1);
        return aki+str+aki;
    }
    public static boolean or35(int n) {
        return (n % 3==0 || n % 5==0);
    }

    public static String front22(String str) {

        if(str.length()<2){
            return str+str+str;
        }
        String front = str.substring(0,2);
        return front+str+front;
    }


}