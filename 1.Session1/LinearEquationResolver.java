import java.util.Scanner;

public class LinearEquationResolver {
    public	static	void	main(String[]	args)	{
        float a,b,c;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" nhap vao he so a: ");
        a = scanner.nextInt();

        System.out.println(" nhap vao he so b: ");
        b = scanner.nextInt();

        if (a == 0 && b == 0){
            System.out.println("phuong trinh co vo so nghiem");
        } else if (a == 0 && b !=0){
            System.out.println(" phuong trinh vo nghiem");
        } else if (a != 0){
            double x = - b/ a;
            System.out.println("phuong trinh co nghiem duy nhat: " +x);
        }

    }
}
