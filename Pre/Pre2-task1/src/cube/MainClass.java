package cube;

import java.util.Scanner;

public class MainClass {
    private static double calcVol(CuboidBox box) {
        return box.getLength() * box.getWidth() * box.getHeight();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        CuboidBox mybox = new ScaleCuboidBox(length, width, height);
        int opCnt = sc.nextInt();
        int op = 0;
        int opNum = 0;
        for (int i = 0; i < opCnt; i++) {
            if (sc.hasNextInt()) {
                op = sc.nextInt();
            }
            if ((op == 4) || (op == 5) || (op == 6)) {
                opNum = sc.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println(mybox.getLength());
                    break;
                case 2:
                    System.out.println(mybox.getWidth());
                    break;
                case 3:
                    System.out.println(mybox.getHeight());
                    break;
                case 4:
                    mybox.setLength(opNum);
                    break;
                case 5:
                    mybox.setWidth(opNum);
                    break;
                case 6:
                    mybox.setHeight(opNum);
                    break;
                case 7:
                    System.out.println(mybox.getVolume());
                    break;
                default:
                    System.out.println("Wrong operation type, " +
                            "supposed to be in range 1-7");
                    break;

            }

        }

    }
}
