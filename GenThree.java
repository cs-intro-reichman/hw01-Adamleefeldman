/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);

		int num1 = (int) (Math.random()*(max-min))+min;
		int num2 = (int) (Math.random()*(max-min))+min;
		int num3 = (int) (Math.random()*(max-min))+min;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		int minNum = Math.min(Math.min(num1, num2), num3);
		System.out.println("The minimal generated number was: " + minNum);











	}
}
