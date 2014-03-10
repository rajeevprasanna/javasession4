package forcesExit;

//Refer : https://gist.github.com/rajeevprasanna/8894161
public class LabelExample {
	public static void main(String[] args) {
		//labelExampleWithBreak();
		labelExampleWithContinue();
	}

	private static void labelExampleWithContinue() {
		// After the continue statement is executed, the flow continues with the
		// next iteration of the loop identified with the label. Finally, when
		// the condition in the outer loop evaluates to false, this loop will
		// finish and Good-Bye will be printed.
		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Hello");
				continue outer;
			} // end of inner loop
			System.out.println("outer"); // Never prints
		}
		System.out.println("Good-Bye");
	}

	private static void labelExampleWithBreak() {
		// In this example the word Hello will be printed one time. Then, the
		// labeled break statement will be executed, and the flow will exit out
		// of the loop labeled outer. The next line of code will then print out
		// Good-Bye.
		boolean isTrue = true;
		outer: for (int i = 0; i < 5; i++) {
			while (isTrue) {
				System.out.println("Hello");
				break outer; 
			} // end of inner while loop
			System.out.println("Outer loop."); // Won't print
		} // end of outer for loop
		System.out.println("Good-Bye");
	}
}
