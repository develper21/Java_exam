class Box {
    double length;
    double width;
    double height;

    Box() {
        length = 1.0;
        width = 1.0;
        height = 1.0;
        System.out.println("No-arguments constructor called. (Default 1x1x1 box)");
    }

    Box(double side) {
        length = side;
        width = side;
        height = side;
        System.out.println("One-argument constructor called. (Cube " + side + "x" + side + "x" + side + ")");
    }

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
        System.out.println("Parameterized (3-arg) constructor called. (" + l + "x" + w + "x" + h + " box)");
    }

    void printVolume() {
        double volume = length * width * height;
        System.out.println("Volume is: " + volume);
        System.out.println("---");
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        
        System.out.println("Creating box1:");
        Box box1 = new Box();
        box1.printVolume();

        System.out.println("Creating box2:");
        Box box2 = new Box(5.0);
        box2.printVolume();

        System.out.println("Creating box3:");
        Box box3 = new Box(4.0, 5.0, 6.0);
        box3.printVolume();
    }
}