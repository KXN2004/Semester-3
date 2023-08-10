/* Programme to Add, Subtract and Multiply two complex numbers */
import java.util.*;

class Complex {

	int realPart, imaginaryPart;

	void setRealPart(int number) {
		realPart = number;
	}

	void setImaginaryPart(int number) {
		imaginaryPart = number;
	}

	int getRealPart() {
		return realPart;
	}

	int getImaginaryPart() {
		return imaginaryPart;
	} 

	Complex addTo(Complex addend) {
		Complex sum = new Complex();
		sum.setRealPart(realPart + addend.getRealPart());
		sum.setImaginaryPart(imaginaryPart + addend.getImaginaryPart());
		return sum;
	}

	Complex subtractFrom(Complex minuend) {
		Complex difference = new Complex();
		difference.setRealPart(minuend.getRealPart() - realPart);
		difference.setImaginaryPart(minuend.getImaginaryPart() - imaginaryPart);
		return difference;
	}

	Complex multiplyWith(Complex multiplier) {
		Complex product = new Complex();
		product.setRealPart(realPart * multiplier.getRealPart() - imaginaryPart * multiplier.getImaginaryPart());
		product.setImaginaryPart(realPart * multiplier.getImaginaryPart() + imaginaryPart * multiplier.getRealPart());
		return product;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Complex left = new Complex(), right = new Complex(), result;

		System.out.println("Enter the real part of A:");
		left.setRealPart(input.nextInt());
		System.out.println("Enter the imaginary part of A:");
		left.setImaginaryPart(input.nextInt());
		System.out.println("Enter the real part of B:");
		right.setRealPart(input.nextInt());
		System.out.println("Enter the imaginary part of B:");
		right.setImaginaryPart(input.nextInt());
		
		result = left.addTo(right);
		System.out.println("A + B = " + result.getRealPart() + " + " + result.getImaginaryPart() + "i");
		result = right.subtractFrom(left);
		System.out.println("A - B = " + result.getRealPart() + " + " + result.getImaginaryPart() + "i");
		result = left.multiplyWith(right);
		System.out.println("A * B = " + result.getRealPart() + " + " + result.getImaginaryPart() + "i");
	}
}