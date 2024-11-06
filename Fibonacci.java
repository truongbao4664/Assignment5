import java.util.Scanner;
public class Fibonacci {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số n (số phần tử của dãy Fibonacci): ");
            int n = scanner.nextInt();

            int first = 0;
            int second = 1;

            System.out.print("Dãy Fibonacci: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                int next = first + second;
                first = second;
                second = next;
            }
        }
    }


