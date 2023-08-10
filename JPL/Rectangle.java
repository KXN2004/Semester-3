import java.util.Scanner;

class Area {

    double length, breadth;

    void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    double getArea() {
        return length * breadth;
    }

}

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Area rectangle = new Area();
        double len, bre;
        System.out.print("Enter length: ");
        len = input.nextDouble();
        System.out.print("Enter breadth: ");
        bre = input.nextDouble();
        rectangle.setDim(len, bre);
        System.out.print("The area of the rectangle is: ");;
        System.out.println(rectangle.getArea());
        input.close();
    }
}