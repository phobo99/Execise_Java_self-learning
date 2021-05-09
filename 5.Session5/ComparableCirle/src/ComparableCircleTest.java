import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCirle[] circles = new ComparableCirle[3];
        circles[0] = new ComparableCirle(3.6);
        circles[1] = new ComparableCirle();
        circles[2] = new ComparableCirle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCirle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCirle circle : circles) {
            System.out.println(circle);
        }
    }
}