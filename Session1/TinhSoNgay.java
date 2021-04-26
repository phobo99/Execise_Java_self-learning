package session1.TinhsoNgay;

import java.util.Scanner;

public class TinhSoNgay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" nhap vao thang can kiem tra");
        int month = scanner.nextInt();

        switch (month){
            case 2:
                System.out.println(" thang 2 co 29 ngay ");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("The month '" + month + "' has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month '" + month + "' has 30 days!");
                break;

        }

    }
}
