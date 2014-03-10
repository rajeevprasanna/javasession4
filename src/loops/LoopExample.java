package loops;

//Refer : https://gist.github.com/rajeevprasanna/8893936
public class LoopExample {
	public static void main(String[] args) {

		// Do - While loop example
		do {
			System.out.println("Inside loop");
		} while (false);

		for (int x = 1; x < 2; x++) {
			System.out.println(x); // Legal
		}
		// System.out.println(x); // Not Legal! x is now out of scope and can't
		// be accessed
 
		/*
		 * for( ; ; ) { System.out.println("Inside an endless loop"); }
		 */
		// In the preceding example, all the declaration parts are left out so
		// the for loop will act like an endless loop.

		for (int i = 0, j = 0; (i < 10) && (j < 10); i++, j++) {
			System.out.println("i is " + i + " j is " + j);
		}

		// Enhanced for loop(for Arrays)
		// Instead of having three components, the enhanced for has two. Let's
		// loop through an array the basic (old) way, and then using the
		// enhanced for:
		int[] a = { 1, 2, 3, 4 };
		for (int x = 0; x < a.length; x++)
			// basic for loop
			System.out.print(a[x]);
		for (int n : a)
			// enhanced for loop
			System.out.print(n);
		
		

	}
}
