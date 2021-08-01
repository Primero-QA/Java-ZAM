public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(checkSum(4, 5));
        System.out.println(checkPositive(0));
        System.out.println(checkNoPositive(-123));
        printCycle("Строка", 4);
        System.out.println(checkLeap(100));
    }

    public static boolean checkSum(int a, int b) {
        return (a+b>=10 && a+b<=20);
    }

    public static String checkPositive(int a) {
      String answer = (a>=0) ? "Позитивное!" : "Негативное!";
        return (answer);
    }

    public static boolean checkNoPositive(int a) {
        return (a<0);
    }

    public static void printCycle(String a, int b) {
        for (; b>0; b--) {
            System.out.println(a);
        }
    }

    public static boolean checkLeap(int a) {
        return ( (a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0)) );
    }

}
