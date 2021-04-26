import java.util.Scanner;

public class TH_sudungtoantu {
    public static void main(String[] args) {
        int width;
        int height;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" nhap vao chieu rong");
        width = scanner.nextInt();

        System.out.println("nhap chieu dai");
        height = scanner.nextInt();

        int S = width * height;
        System.out.println(" dien tich hinh chu nhat la: " + S);

    }
}
