package Homework2;
import java.util.Scanner;

public class NestedLoopsExercise {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        testSquarePattern();
        testCheckerPattern();
        testTimeTable();
        testTriangularPattern();
        testBoxPattern();
        testHillPattern();

    }

    //2.1
    public static void squarePattern(int number) {
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }

    public static void squarePattern2(int number) {
        int row = 0;
        int col = 0;
        while (row < number) {
            while (col < number) {
                System.out.print('#');
                col++;
            }
            System.out.println();
            row++;
            col = 0;
        }

    }

    public static void testSquarePattern() {
        System.out.print("Enter the size: ");
        int number = in.nextInt();
        squarePattern(number);
        System.out.println("Try while loop: ");
        squarePattern2(number);
    }


    //2.2
    public static void checkerPattern(int number) {
        for (int row = 0; row < number; row++) {
            if (row % 2 != 0) {
                for (int col = 0; col < number; col++) {
                    if (col == 0) {
                        System.out.print(" #");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            } else {
                for (int col = 0; col < number; col++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }

    public static void testCheckerPattern() {
        System.out.print("Enter the size: ");
        int number = in.nextInt();
        checkerPattern(number);
    }

    //2.3
    public static void testTimeTable() {
        System.out.print("Enter the size: ");
        int size = in.nextInt();
        timeTable(size);
    }

    public static void timeTable(int num) {
        System.out.print("∗ |");
        for (int i = 1; i <= num; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n-------------------------------------------");

        for (int i = 1; i <= num; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= num; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    //2.4
    public static void triangularPatternA(int number) {
        for (int row = number - 1; row > -1; row--) {
            for (int col = 0; col < number - row; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void triangularPatternB(int number) {
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number - row; col++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }

    public static void triangularPatternC(int number) {
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                if (col < row) {
                    System.out.print(' ');
                } else System.out.print('#');
            }
            System.out.println();
        }
    }

    public static void triangularPatternD(int number) {
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                if (col < number - row - 1) {
                    System.out.print(' ');
                } else {
                    System.out.print('#');
                }
            }
            System.out.println();
        }
    }

    public static void testTriangularPattern() {
        System.out.print("Enter the size: ");
        int number = in.nextInt();
        triangularPatternA(number);
        System.out.println();
        triangularPatternB(number);
        System.out.println();
        triangularPatternC(number);
        System.out.println();
        triangularPatternD(number);
    }

    //2.5
    public static void boxPatternA(int number) {
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                if (row == 0 || row == number - 1 || col == 0 || col == number - 1) {
                    System.out.print('#');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternB(int number) {

    }

    public static void boxPatternC(int number) {
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                if (row == 0 || row == number - 1 || row + col == number - 1) {
                    System.out.print('#');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternD(int number) {
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                if (row == 0 || row == number - 1 || row + col == number - 1 || row == col) {
                    System.out.print('#');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void testBoxPattern(){
        int number = in.nextInt();
        boxPatternA(number);
        System.out.println();
        boxPatternB(number);
        System.out.println();
        boxPatternC(number);
        System.out.println();
        boxPatternD(number);
    }

    public static void hillPatternA(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                int numberCharsNotEmpty = row * 2 + 1;
                int indexStart = size - row - 1;
                int indexEnd = indexStart + numberCharsNotEmpty - 1;
                System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void hillPatternB(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                int numberCharsNotEmpty = size * 2 - 1 - row * 2;
                int indexStart = row;
                int indexEnd = indexStart + numberCharsNotEmpty - 1;
                System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void testHillPattern(){
        int number = in.nextInt();
        hillPatternA(number);
        System.out.println();
        hillPatternB(number);
        System.out.println();
    }
}

