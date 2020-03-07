package ch13.errorHandling.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	// throws를 이용하여 메서드르 호출하는 곳에서 예외를 처리하도록 명시
	public void loadClass() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("a.txt");
	}

	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		
		try {
			// 예외가 발생할 수 있는 클래스를 호출
			test.loadClass();

		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe); 
			// java.io.FileNotFoundException: a.txt (지정된 파일을 찾을 수 없습니다)
		}
	}
}
