package Assignment;

public class Example3 {

	public static void main(String[] args) {
		
		int num1 = 20, num2 = 45, num3 = 15;

		if (num1 > num2 && num1 > num3)
			System.out.println(num1 + " is largest number");

		else if (num2 > num1 && num2 > num3)
			System.out.println(num2 + " is largest number");

		else
			System.out.println(num3 + " is largest number");

	}
}