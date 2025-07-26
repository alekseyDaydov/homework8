import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        int[] massInt = new int[3];
        massInt[0] = 1;
        massInt[1] = 2;
        massInt[2] = 3;

        double massDouble[] = {1.57, 7.654, 9.986};

        long massLong[] = new long[5];
        massLong[0] = 1L;
        massLong[1] = 3L;
        massLong[2] = 5L;
        massLong[3] = 7L;
        massLong[4] = 8L;

        //task2
        for (int i = 0; i < massInt.length; i++) {
            if (i == (massInt.length - 1)) {
                System.out.print(massInt[i]);
            } else {
                System.out.print(massInt[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < massDouble.length; i++) {
            if (i == (massDouble.length - 1)) {
                System.out.print(massDouble[i]);
            } else {
                System.out.print(massDouble[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < massLong.length; i++) {
            if (i == (massLong.length - 1)) {
                System.out.print(massLong[i]);
            } else {
                System.out.print(massLong[i] + ", ");
            }
        }
        System.out.println();

        //task3
        for (int i = massInt.length - 1; i >= 0; i--) {
            System.out.print(massInt[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = massDouble.length - 1; i >= 0; i--) {
            System.out.print(massDouble[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = massLong.length - 1; i >= 0; i--) {
            System.out.print(massLong[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //task4
        for (int i = 0; i < massInt.length; i++) {
            if (massInt[i] % 2 != 0) {
                massInt[i] += 1;
            }
        }
        System.out.println(Arrays.toString(massInt));
    }
}