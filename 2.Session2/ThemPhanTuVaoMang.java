simport java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int arr[] =new  int[20];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 40;
        arr[3] = 5;
        arr[4] = 1;
        Scanner chen = new Scanner(System.in);
        System.out.println("nhap vao gia tri can them");
        int giatri = chen.nextInt();
        System.out.println(" nhap vao vi tri can them");
        int vitri = chen.nextInt();

        if (vitri < 0 || vitri > arr.length ){
            System.out.println(" gia tri nhap vao khong thoa man");
        } else{
            nhapMang( arr,vitri,giatri);
            xuatMang(arr);
        }
    }
    public static void  xuatMang(int arr[]){
        for (int i = 0; i <arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void  nhapMang(int arr[], int vitri, int giatri){
        int temp1 = arr[vitri];
        arr[vitri] = giatri;
        for (int i = vitri + 1; i < arr.length; i++){
            int temp2 = arr[i];
            arr[i] = temp1;
            temp1 = temp2;
        }
    }
}
