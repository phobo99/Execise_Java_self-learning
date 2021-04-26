public class SoNguyenTo {
    public static void main(String[] args) {
        int dem = 3;
        for (int i = 2 ;i < 100 ;i++) {

            if (isPrime(i)){
                System.out.print(i +", ");
                dem++;
            }
        }
    }

    public static boolean isPrime (int data) {
        int dem =0;
        for (int i = 2 ; i <= Math.sqrt(data) ; i++) {
            if (data % i ==0) {
                dem++;
            }
        }
        if (dem == 0) {
            return true;
        }
        return false;
    }
}
