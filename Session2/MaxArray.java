import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" nhap vao do dai cua mang");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println(" do dai khong qua 20");
            }
        } while ( size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("phan tu thu" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("danh sach mang vua nhap vao: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println(" so lon nhat la  " + max + " , o vi tri " + index);
    }
}
