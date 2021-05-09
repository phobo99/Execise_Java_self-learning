package Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 10;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with color of: "
                + this.getColor()
                + " and "
                + "Volume equals: "
                + String.format("%.3f", this.getVolume())
                + ".";
    }
}
