package Day1;

public class Boolean {
    public static void main(String[] args) {

        System.out.println(icyHot(116, -5));
        System.out.println(loneTeen(13, 13));

    }


    public static boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b <= 20 && b >= 10)) {
            return true;
        } else {
            return false;

        }
    }

    public boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) ^ (b >= 13 && b <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        } else {
            return str;
        }

    }
}
