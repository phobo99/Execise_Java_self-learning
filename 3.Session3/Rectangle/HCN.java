package Rectangle;

import java.util.Scanner;

public class HCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Dien tich cua hinh chu nhat: "+ rectangle.getPerimeter());
        System.out.println("Chu vi cua hinh chu nhat: "+ rectangle.getArea());
    }
}
