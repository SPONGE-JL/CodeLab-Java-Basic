package ch13.errorHandling.exception;

public class AutoCloseTest {
	
	public static void main(String[] args) {
		
		try (AutoCloseObj obj = new AutoCloseObj()){
			System.out.println("Exception 강제 발생");
			throw new Exception("던져진 예외 메시지!");
		} catch (Exception e) {
			System.out.println(e);
		}

		/*
			Exception 강제 발생
			CLOSED OK!
			java.lang.Exception: 던져진 예외 메시지!
		 */

	}

}

// AutoClosable Overriding
class AutoCloseObj implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("CLOSED OK!");
	}
}
