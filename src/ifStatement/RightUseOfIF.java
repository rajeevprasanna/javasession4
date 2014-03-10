package ifStatement;

//Refer:https://gist.github.com/rajeevprasanna/8893069
public class RightUseOfIF {
	public static void main(String[] args) {

		// Example1 : Always keep the lower scope first in if loop.
		int x = 1;
		if (x == 3) {
			System.out.println("indide loop");
		} else if (x < 4) {
			System.out.println("<4");
		} else if (x < 2) {// Appropriate to keep this block before <4 block
			System.out.println("<2");
		} else {
			System.out.println("else");
		}

		// Example2 : Always keep the curly braces.
		int y = 43;
		if (y < 45)
			if (y < 31)
				System.out.println("Try again.");
		else
			System.out.println("Java master!"); // Hmmmmm... now where does
												// it belong?

		// Example3 : The expression in an if statement must be a boolean
		// expression. Any expression that resolves to a boolean is fine, and
		// some of the expressions can be complex.
		y = 5;
		x = 2;
		if (((x > 3) && (y < 2)) | doStuff()) {
			System.out.println("true");
		}

		// Example4 :
		// One common mistake programmers make (and that can be difficult to
		// spot), is assigning a boolean variable when you meant to test a
		// boolean variable. Look out for code like the following:
		boolean boo = false;
		if (boo = true) {
			System.out.println("test boo");
		}
	}

	private static boolean doStuff() {
		return true;
	}

}
