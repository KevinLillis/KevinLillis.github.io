
import java.util.Scanner;

/**
 *
 * @author Dr. Lillis
 */
public class PythagoreanTriples {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = keyboard.nextInt();
        
        for (int a = 1; a <= n; a++) {
            for (int b = a + 1; b <= n; b++) {
                for (int c = b + 1; c <= n; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.printf("%d, %d, %d%n", a, b, c);
                    }
                }
            }
        }

    }
}
