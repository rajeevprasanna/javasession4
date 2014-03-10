package exceptions;

import java.sql.SQLDataException;

//Refer: https://gist.github.com/rajeevprasanna/8894887
public class ExceptionHandling {
	public static void main(String[] args) throws SQLDataException {
		// doStuff();//throws unchecked java.lang.ArithmeticException
		handleMultipleExceptions();
		resistDoingLikeThis();
		exceptionHandlingHierarchy();
		throwErrorHandling();
	}

	private static void throwErrorHandling() {
		badMethod();
	}

	static void badMethod() { // No need to declare an Error
		doStuff2();
	}

	static void doStuff2() { // No need to declare an Error
		try {
			throw new Error();
		} catch (Error me) {
			throw me; // We catch it, but then rethrow it
		}
	}

	private static void exceptionHandlingHierarchy() {
		// The handlers for the most specific exceptions must always be placed
		// above those for more general exceptions.
		/*
		 * try { // do risky IO things } catch (IOException e) { // handle
		 * general IOExceptions } catch (FileNotFoundException ex) { // handle
		 * just FileNotFoundException }
		 */
	}

	private static void resistDoingLikeThis() throws SQLDataException {
		// Resist the temptation to write a single catch all exception handler
		// such as the following:
		//get user details from db
		
		
		
		
		try {
			//String user = getUserDetails(232);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		  

	//service1
	//servvice2
	private static boolean persistUserDetails(String userName) throws MyAppException {
		// TODO Auto-generated method stub
		//log.debug("input" + i)
		try{			
			//open connection to db
			//perform some business logic			
		}catch(Exception e){
			
		}finally{
			//close connection to the database
		}
		
		try {
			throw new SQLDataException();
		} catch (SQLDataException e) {
			//log.error
			//info
			//debug
			System.out.println(e.getStackTrace());
			//throw new Exception("my api is down");
		}
		 
		throw new MyAppException("message");
		 
	}

	private static void handleMultipleExceptions() {
		// class IndexOutOfBoundsException has two subclasses,
		// ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException.
		// You may want to write one exception handler that deals with
		// exceptions produced by either type of boundary error, but you might
		// not be concerned with which exception you actually have

		try {
			// Some code here that can throw a boundary exception
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	static void doStuff() {
		doMoreStuff();
	}

	static void doMoreStuff() {
		int x = 5 / 0; // Can't divide by zero!
						// ArithmeticException is thrown here
	}
}
