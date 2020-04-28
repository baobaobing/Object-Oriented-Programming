package cube;

public class ScaleCuboidBox extends CuboidBox {
    public ScaleCuboidBox(double length, double width, double height) {
        super(length, width, height);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
}
