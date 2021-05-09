public class ComparableCirle extends Circle implements Comparable<ComparableCirle>{
    public ComparableCirle() {
    }

    public ComparableCirle(double radius) {
        super(radius);
    }

    public ComparableCirle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public boolean compareTo(ComparableCirle comparableCirle) {
        if (getRadius() > comparableCirle.getRadius()) return true;
        else if (getRadius() < comparableCirle.getRadius()) return false;
        else return false;

    }
}