package day1.basicprogram;

public class Example1 {

//	public static void main(String[] args) {
//		factor(10);
//	}
//
//	public static void factor(int num) {
//		System.out.println("Factors of "+num+" is: ");
//	
//		for (int i = 1; i <= num; i++)
//		{
//			if (num % i == 0) {
//				System.out.print(i+" ");
//			}
//		}
//	}

	public static void main(String[] args) {
		prime(5, 10);
	}

	public static void prime(int num1, int num2) {
		int count = 0;
		for (int i = num1; i <= num2; i++) {
			if (num2 % i == 0) {
				count++;
				if (count == 2)
					;
				{
					System.out.println(i + " ");
				}
			}
		}
	}
//	public static void main(String[] args) {
//		reverse(5);
//	}
//	public static void reverse(int n) {
//		for(int i=n;i>=1;i--) {
//			System.out.println(i+" ");
//		}
//	}
}