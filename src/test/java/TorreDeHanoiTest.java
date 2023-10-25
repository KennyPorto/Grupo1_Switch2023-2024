import org.junit.Test;

public class TorreDeHanoiTest {
    @Test
    public void testTowerOfHanoi3Disks(){
        // Arrange
        int n = 3;
        char from_rod = 'A';
        char to_rod = 'C';
        char aux_rod = 'B';

        // Act
        TorreDeHanoi.towerOfHanoi(n, from_rod, to_rod, aux_rod);

        // Assert
        // Nothing to be done
    }

    @Test
    public void testTowerOfHanoi4DisksSucess(){
        // Arrange
        int n = 20;
        char from_rod = 'A';
        char to_rod = 'C';
        char aux_rod = 'B';

        // Act
        TorreDeHanoi.towerOfHanoi(n, from_rod, to_rod, aux_rod);

        // Assert
        // Nothing to be done
    }
}
