package homework;

public class HW052 {
    public static void main(String[] args) {
        //TODO
        // 0  1  2  3  4  5  6  7  8  9
        // 0  1  2  3  4  5  6  7  8
        // 0  1  2  3  4  5  6  7
        // 0  1  2  3  4  5  6
        // 0  1  2  3  4  5
        // 0  1  2  3  4
        // 0  1  2  3
        // 0  1  2
        // 0  1
        // 0
        System.out.println("\nTask 1-------------------------------\n");
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //TODO
        // 0  1  2  3  4  5  6  7  8  9
        //    0  1  2  3  4  5  6  7  8
        //       0  1  2  3  4  5  6  7
        //          0  1  2  3  4  5  6
        //             0  1  2  3  4  5
        //                0  1  2  3  4
        //                   0  1  2  3
        //                      0  1  2
        //                         0  1
        //                            0

        System.out.println("\nTask 2-------------------------------\n");
        for (int i = 0; i <= 9; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= 9 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //TODO
        // 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
        //   8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
        //     7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
        //         6 5 4 3 2 1 0 1 2 3 4 5 6
        //           5 4 3 2 1 0 1 2 3 4 5
        //             4 3 2 1 0 1 2 3 4
        //               3 2 1 0 1 2 3
        //                 2 1 0 1 2
        //                   1 0 1
        //                     0

        System.out.println("\nTask 3-------------------------------\n");
        for (int i = 0; i <= 9; i++) {
            for (int l = 1; l <= i; l++) {
                System.out.print("  ");
            }
            for (int k = 9 - i; k >= 0; k--) {
                System.out.print(k + " ");
            }
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
