package cube;

public class CuboidBox {
    private double length;
    private double width;
    private double height;

    public CuboidBox() {

    }

    public CuboidBox(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void printVolume() {
        System.out.println("The volume of the box is " +
                height * length * width + ".");
    }

    public double getVolume() {
        return height * length * width;
    }
}
