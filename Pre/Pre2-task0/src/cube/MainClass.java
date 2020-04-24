package cube;

//import java.io.*;
public class MainClass {
    private static double calcVol(CuboidBox box) {
        return box.getLength() * box.getWidth() * box.getHeight();
    }

    public static void main(String[] args) {
        CuboidBox mybox = new CuboidBox();

        mybox.setLength(10);
        mybox.setWidth(10);
        mybox.setHeight(20);
        mybox.printVolume();
        double vol;
        vol = mybox.getLength() * mybox.getWidth() * mybox.getHeight();
        System.out.println("The volume of the box is " + vol + ".");
        System.out.println("The volume of the box is " + calcVol(mybox) + ".");
        System.out.println("The volume of the box is " +
                mybox.getVolume() + ".");
    }
}
