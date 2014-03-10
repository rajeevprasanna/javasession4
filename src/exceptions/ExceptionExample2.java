package exceptions;

public class ExceptionExample2 {
	public static void main(String[] args) {
		String s = getLastReturnValue();
		System.out.println(s);
	}

	private static String getLastReturnValue() {
		try {
			return "try";
		} catch (Exception e) {
			return "catch";
		} finally {
			// Return statement in the finally block override the one returned
			// in try block.
			// That's why, a rule of thumb - never return from finally. Eclipse,
			// for example, shows a warnings for that snippet:
			// "finally block does not complete normally"
			// Finally is always executed. the only exception is System.exit()
			return "finally";
		}
	}
}
