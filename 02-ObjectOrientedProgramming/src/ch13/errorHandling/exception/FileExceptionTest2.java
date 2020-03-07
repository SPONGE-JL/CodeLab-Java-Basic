package ch13.errorHandling.exception;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class FileExceptionTest2 {

	public static void main(String[] args) {

		// AutoClosable이 구현된 FileInputStream은
		// close()메소드 자동 호출 (Java 7이상)
		try(FileInputStream fis = new FileInputStream("nofile.txt")) {

		} catch (FilerException fe) {
			System.out.println("호출");
			System.out.println(fe);

		} catch (IOException ioe) {
			System.out.println(ioe);

		}
		
		System.out.println("AutoClosable을 별도로 하지 않았으므로 별다른 출력이 없이 종료합니다.");
		
		/*
			java.io.FileNotFoundException: nofile.txt (지정된 파일을 찾을 수 없습니다)
			AutoClosable을 별도로 하지 않았으므로 별다른 출력이 없이 종료합니다.
		 */
	}

}
