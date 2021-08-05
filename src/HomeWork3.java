import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
       intArrays();
        diagonalFill(5);
        System.out.println(Arrays.toString(variableArray(10, 4)));
    }
    public static void intArrays() {
        int[] myArray = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (myArray[i] == 1) ? 0 : 1;
        }
        System.out.println(Arrays.toString(myArray));

        int[] myArray2 = new int[100];
        for (int i = 0; i < myArray2.length; i++) {
            myArray2[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArray2));

        int[] myArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(myArray3));
        for (int i = 0; i < myArray3.length; i++) {
            myArray3[i] = (myArray3[i] < 6) ? myArray3[i] * 2 : myArray3[i];
        }
        System.out.println(Arrays.toString(myArray3));
    }

    public static void diagonalFill(int x) {
        int[][] myDoubleArray = new int[x][x];
        int y = 0;
        for (x--; x >= 0; x--) {
            myDoubleArray[x][x] = 1;
            myDoubleArray[x][y] = 1;
            y++;
        }
        for (int i = 0; i < myDoubleArray.length; i++) {
            System.out.println(Arrays.toString(myDoubleArray[i]));
        }
    }

    public static int[] variableArray(int len, int initialValue) {
        int[] varArray = new int[len];
        for (int i = 0; i < len; i++) {
            varArray[i] = initialValue;
        }
        return varArray;
    }
}
