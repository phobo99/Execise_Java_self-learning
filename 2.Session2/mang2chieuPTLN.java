import java.util.Scanner;

public class mang2chieuPTLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m,n;
        System.out.println("Nhập vào số dòng của ma tran: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma tran ");
        n = scanner.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = arr[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println(" phan tu lon nhat trong mang la " +max);


    }
}
