import java.util.Scanner;

public class Bangcuuchuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số từ người dùng
        System.out.print("Nhập một số để in bảng cửu chương: ");
        int number = scanner.nextInt();

        System.out.println("Bảng cửu chương của " + number + ":");

        // Vòng lặp for để in bảng cửu chương từ 1 đến 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
