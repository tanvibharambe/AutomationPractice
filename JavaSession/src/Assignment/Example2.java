package Assignment;

public class Example2 {

	public static void main(String[] args) {
		int x = 10, y = 20, z;     // z is temporary veriable
		System.out.println("Value of x is : " + x);
		System.out.println("Value of y is : " + y);
		z = x;
		x = y;
		y = z;
		System.out.println("Value of x after swaping is: " + x);
		System.out.println("Value of y after swaping is: " + y);

	}

}
