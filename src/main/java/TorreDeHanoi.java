//method to solve the tower of hanoi problem with n disks and n different poles

public class TorreDeHanoi {
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Mover disco 1 da haste " + from_rod + " para a haste " + to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Mover disco " + n + " da haste " + from_rod + " para a haste " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    // ---------- Torre de Hannoi Pedro --------------------

        public static boolean isRodEmpty(int rod, int numberOfDiscs, int[][] array) {
            int sum = 0;
            for (int i = 0; i < numberOfDiscs; i++) {
                sum += array[rod][i];
            }
            if (sum == 0) return true;
            else {
                return false;
            }
        }

        public static int getMinValueFromRod(int rod, int numberOfDiscs, int[][] array) {
            int minRodValue = numberOfDiscs;
            for (int i = 0; i < numberOfDiscs; i++) {
                if (array[rod][i] < minRodValue) {
                    minRodValue = array[rod][i];
                }
            }
            return minRodValue;
        }

        public static boolean isSafeToMove(int beginRod, int endRod, int numberOfDiscs, int[][] array) {
            int beginRodValue = getMinValueFromRod(beginRod, numberOfDiscs, array);
            int endRodValue = getMinValueFromRod(endRod, numberOfDiscs, array);
            if (beginRodValue < endRodValue) return true;
        }

        public static boolean canIMove(int beginRod, int endRod, int numberOfDiscs, int[][] array) {
            if (isRodEmpty(endRod, numberOfDiscs, array) return true;
            else if (isSafeToMove(beginRod, endRod, numberOfDiscs, array)) {
                return true;
            } else {
                return false;
            }
        }

        public static int towerOfHanoi() {
        // Build the array with 3 rod and 4 discs
        // array[line][column] - line (rod) column (discs)
        int[][] array = {{1, 2, 3, 4}, {0, 0, 0, 0}, {0, 0, 0, 0}};


    }

}
