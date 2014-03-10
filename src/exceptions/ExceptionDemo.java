package exceptions;

public class ExceptionDemo {
	
	public static void main(String[] args) throws MyAppException {
		ExceptionDemo exceptionDemo = new ExceptionDemo();
		try {
			exceptionDemo.displayNumbers();
			// Keep the only piece of code which can throw exception in try
			// block
		} catch (MyAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			
		}catch(Throwable t){
			//throw new MyAppException();
			//throw new MyAppException("ex");
			throw new MyAppException(t);
		}
	}
 
	public void displayNumbers() throws MyAppException {
		for (int i = 0; i < 10; i++) {
			System.out.println("i= " + i);
			if (i == 6) {
				throw new MyAppException("My Exception Occurred");
			}
		}
	}
}
