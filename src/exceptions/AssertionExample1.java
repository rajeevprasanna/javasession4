package exceptions;

public class AssertionExample1 {
	// U can enable assertions by giving -ea as JVM args in eclipse
	public static void main(String[] args) {
		methodB(-1);
		doStuff(4);
		assertWithSwitch(1);
		assertWithSideeffects();
		
		try{
			methodB(-3);
		}catch(Throwable t){
			
		}
	}

	private static void assertWithSideeffects() {
		assert (modifyThings());
		// continues on
	}

	private static int x1;
	private static int y1;

	public static boolean modifyThings() {
		y1 = ++x1;
		//x1 = 0
		//y1 = 0
		return true;
	}

	public static void assertWithSwitch(int x) {
		int y = 0;
		switch (x) {
		case 1:
			y = 3;
			break;
		case 2:
			y = 9;
			break;
		case 3:
			y = 27;
			break;
		default:
			assert false; // we're never supposed to get here!
		}
	}

	public static void methodB(int num) {
		int x = 5;
		assert (num >= 0); // throws an AssertionError
		// if this test isn't true
		useNum(num + x);
	}

	// you're so certain of your assumption, you don't want to take the time (or
	// program performance hit)
	// to write exception-handling code. And at runtime, you
	// don't want the if/else either because if you do reach the else condition,
	// it means
	// your earlier logic (whatever was running prior to this method being
	// called) is flawed.
	private void methodA(int num) {
		int x = 5;
		if (num >= 0) {
			useNum(num + x);
		} else { // num must be < 0
			// This code should never be reached!
			System.out.println("Yikes! num is a negative number! " + num);

		}
	}

	private static void useNum(int i) {
		// TODO Auto-generated method stub
		System.out.println("useNum method is called with input => " + i);
	}

	// The following is an inappropriate use of assertions:
	public static void doStuff(int x) {
		assert (x > 0); // inappropriate !
		// do things with x
	}
}
