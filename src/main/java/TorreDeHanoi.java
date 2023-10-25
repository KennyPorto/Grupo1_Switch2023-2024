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

}