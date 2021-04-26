package session1.ChiSoCanNang;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        double weight, heght,bmi;

        System.out.println(" nhap vao so can nang kg");
        weight = nhap.nextDouble();
        System.out.println(" nhap vao chieu cao");
        heght = nhap.nextDouble();

        bmi = weight / Math.pow(heght,2);

        if ( bmi < 18){
            System.out.println(" chi so bmi" + bmi + "can nang thieu");
        } else  if ( bmi < 25){
            System.out.println("chi so bmi" + bmi + " can nang binh thuong");
        } else if ( bmi < 30){
            System.out.println("chi so bmi" + bmi + " thua can");
        } else {
            System.out.println(" ban da bi map roi");
        }
    }
}
