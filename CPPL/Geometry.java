abstract class Shape {

	abstract int RectangleArea(int lenght, int breadth);

	abstract int SquareArea(int side);

	abstract double CircleArea(int radius);

}

class area extends Shape {

	int RectangleArea(int lenght, int breadth) { return lenght * breadth; }

	int SquareArea(int side) { return side * side; }

	double CircleArea(int radius) { return 3.14 * radius * radius; }
	
}

class Geometry {
	public static void main(String[] args) {
		area a = new area();
		System.out.println("Area of 2x3 rectangle: " + a.RectangleArea(2, 3));
		System.out.println("Area of square of side 5: " + a.SquareArea(5));
		System.out.println("Area of circle of radius 7: " + a.CircleArea(7));
	}
}