package switchStatement;

//Refer : https://gist.github.com/rajeevprasanna/8893481
public class SwitchExample {

	public static void main(String[] args) {
		// Example1 : Replacing if block to switch statement
		//convertIfToSwitchExample();
		//caseConstantAndCompileTimeConstant();
	 // switchOnSmallerVariables();
	  	//duplicateCaseLabel();
	  	//boxingWithSwitch();
	  	//switchWithEnum();
		defaultCase();
	}

	private static void defaultCase() {
		int x = 21;
		switch (x) {
		case 2:
		case 4:
		case 6:
		case 8:
		case 10: {
			System.out.println("x is an even number");
			break;
		}
		default:
			System.out.println("x is an odd number");
		}

		x = 2;
		switch (x) {
		case 2:
			System.out.println("2");
		default:
			System.out.println("default");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		}
	}

	enum Color {
		red, green, blue
	}

	private static void switchWithEnum() {
		Color c = Color.green;
		switch (c) {
		case red:
			System.out.print("red ");
		case green:
			System.out.print("green ");
		case blue:
			System.out.print("blue ");
		default:
			System.out.println("done");
		}
	}

	private static void boxingWithSwitch() {
		// Legal to have boxing
		switch (new Integer(4)) {
		case 4:
			System.out.println("boxing is OK");
		}
	}

	private static void duplicateCaseLabel() {
		int temp = 90;
		switch (temp) {
		case 80:
			System.out.println("80");
		//case 80 : System.out.println("80"); // won't compile!
		case 90:
			System.out.println("90");
		default:
			System.out.println("default");
		}
	}

	private static void switchOnSmallerVariables() {
		byte g = 2;
		switch (g) {
		case 23:
			 //case 128:
			// This code won't compile. Although the switch argument is legal.
			// byte is implicitly cast to an int. The second case argument (128)
			// is too large for a byte, and the compiler knows it!
		}
 
	}

	private static void caseConstantAndCompileTimeConstant() {
		// Refer:http://stackoverflow.com/questions/9082971/compile-time-constants-and-variables
		// private final int x = getX(); is not a compiler constant as it can
		// vary
		//
		// private int y = 10; is not constant (non-final in this case), so
		// optimizer cannot be sure that the value would not change in the
		// future.

		final int a = 1;
		final int b;
		b = 2;
		int x = 0;
		switch (x) {
		case a:
		//case b:
			// ok
			// compiler error
		}

		// Note that for this code to be legal, the method being invoked on the
		// object reference must return a value compatible with an int.
		String s = "xyz";
		switch (s.length()) {
		case 1:
			System.out.println("length is one");
			break;
		case 2:
			System.out.println("length is two");
			break;
		case 3:
			System.out.println("length is three");
			break;
		default:
			System.out.println("no match");
		}

	}

	private static void convertIfToSwitchExample() {
		int x = 3;
		if (x == 1) {
			System.out.println("x equals 1");
		} else if (x == 2) {
			System.out.println("x equals 2");
		} else if (x == 3) {
			System.out.println("x equals 3");
		} else {
			System.out.println("No idea what x is");
		}

		// Convert the above code to switch block
		x = 2;
		switch (x) {
		case 1:
			/*System.out.println("x is equal to 1");
			break;*/
		case 2:
			System.out.println("x is equal to 2");
			break;
		case 3:
			System.out.println("x is equal to 3");
			break;
		default:
			System.out.println("Still no idea what x is");
		}
	}
}
