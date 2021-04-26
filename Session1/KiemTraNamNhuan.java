package session1.KiemTraNamNhuan;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao nam can kiem tra: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d day la nam nhuan", year);
        } else {
            System.out.printf("%d khong phai nam nhuan", year);
        }


    }
}
