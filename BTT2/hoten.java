import java.util.Scanner;

public class HoTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ho va ten: ");
        String hoTen = scanner.nextLine();

        System.out.println("Xin chao: " + hoTen);

        scanner.close();
    }
}