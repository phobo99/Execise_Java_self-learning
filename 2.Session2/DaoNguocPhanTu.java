package session2.daonguocphantumang;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9,10};
        for(int i = 0 ; i < daoNguoc(arr).length ; i++) {
            System.out.print(daoNguoc(arr)[i] +" ");
        }
    }
    public static int[] daoNguoc(int arr[]) {
        int array1[] = new int[arr.length];
        int cout = 0;
        for (int i = arr.length -1 ; i>=0 ; i--) {
            array1[cout] = arr[i];
            cout++;
        }
        return array1;
    }
}
