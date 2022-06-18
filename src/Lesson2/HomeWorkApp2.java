package Lesson2;


public class HomeWorkApp2 {
    public static void main(String[] args) {
        if (trueOrfalse(9, 7) == true) ;
        System.out.println("Soo good");
        if (positiveOrNegative(3)) ;
        System.out.println(("yeeep"));
        if (onlyNegative(-10)) ;
        System.out.println("Badgood");
        mnogoSlov("Dmitry", 77);


    }

    public static boolean trueOrfalse(int a, int b) {
        if (a + b > 10 && a + b < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean positiveOrNegative(int num) {
        return num >= 0;
    }

    public static boolean onlyNegative(int num2) {
        if (num2 < 0) return true;
        return false;
    }

    public static void mnogoSlov(String name, int num3) {
        System.out.println("Hello" + name + num3);
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello, " + name + num3);
        }
        System.out.println();


    }
}
