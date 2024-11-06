import java.util.Random;
import java.util.Scanner;

public class Userguess {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(50) + 1;
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Hay doan so dung: ");
            n = sc.nextInt();

            if (n > rand) {
                System.out.println("Your number is too high.");
            } else if (n < rand) {
                System.out.println("Your number is too low.");
            }
        } while (n !=rand);

        System.out.println("Your answer is correct!");
    }
}
