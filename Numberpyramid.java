import java.util.Scanner;

public class Numberpyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng của kim tự tháp từ người dùng
        System.out.print("Nhập số hàng của kim tự tháp: ");
        int n = scanner.nextInt();

        // Vòng lặp để tạo từng hàng của kim tự tháp
        for (int i = 1; i <= n; i++) {
            // In các số từ 1 đến i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Xuống dòng sau mỗi hàng
        }
    }
}
