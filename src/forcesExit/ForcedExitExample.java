package forcesExit;

//Refer : https://gist.github.com/rajeevprasanna/8894100
public class ForcedExitExample {

	public static void main(String[] args) {

		// testSystemExit();
		// returnExample();
		// breakExample();
		// breakInnerLoopExample();
		continueExample();
	}

	private static void continueExample() {
		for (int i = 0; i < 10; i++) {// Works like a normal loop			 
			if (i == 5) {
				continue;
			}			 
			System.out.println((i + 1) + " :  Inside loop");						
		}
	}

	private static void testSystemExit() {
		System.out
				.println("Doing system.exit. so next code will not be executed as JVM shuts down");
		System.exit(0);
	}

	// 0 -> outer --> inner -->3(0 to 2)
	// 1 -> outer -->inner is printed once
	// 2 --> not execute

	private static void breakInnerLoopExample() {
		for (int x = 0; x < 2; x++) {
			System.out.println("in the outer for loop");
			for (int y = 0; y < 3; y++) {
				System.out.println("in break  inner loop");
				if (x == 1) {
					break;
				}
			}
		}
	}

	private static void breakExample() {
		for (int x = 0; x < 5; x++) {
			System.out.println("in break loop");
			if (x == 3) {
				break;
			}
		}
	}

	static void returnExample() {
		for (int x = 0; x < 3; x++) {
			System.out.println("in return loop");
			return;
		}
		return;// redundant.. no use of this statement as any way method call
				// returns
	}
}
