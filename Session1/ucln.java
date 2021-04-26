import java.util.Scanner;

public class ucln {
    public static void main(String[] args) {
        int a,b;

        Scanner nhap = new Scanner(System.in);
        System.out.println(" nhap vao so a: ");
        a = nhap.nextInt();

        System.out.println("nhap vao so b: ");
        b = nhap.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a ==0 || b ==0){
            System.out.println(" khong co uoc chung lon nhat");
        } else {
            while ( a != b){
                if (a >b){
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println(" uoc chung lon nhat la" +a);
        }
    }
}
