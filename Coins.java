/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int num_coins = Integer.parseInt(args[0]);
		int num_quarters = num_coins/25;
		int num_cents = num_coins%25;

		System.out.println( "Use "  + num_quarters + " quarters " + "and " + num_cents + " cents");
	}
}