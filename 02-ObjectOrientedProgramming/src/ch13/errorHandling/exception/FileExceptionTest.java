package ch13.errorHandling.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionTest {

	public static void main(String[] args) {

		FileInputStream fis = null;
		
		// 읽으려고하는 파일이 없을 수 있으므로 try-catch 블록으로 감싸야함
		try {
			fis = new FileInputStream("nofile.txt");

		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe);

		} finally { // try-catch블록을 수행한 이후 반드시 수행하도록 정의된 블록
			
			// 파일 객체를 닫다가도 예외가 생길 수 있으므로 try-catch 블록으로 또한번 감싸야함
			try {
				System.out.println("finally~!!");
				fis.close();

			} catch (NullPointerException ne) {
				System.out.println(ne + " : fis 객체는 현재 null입니다.");

			} catch (Exception e) {
				System.out.println(e);

			} // end of try-catch-catch

		} // end of try-catch-finally

		System.out.println("프로그램을 정상 종료 합니다.");

		/*
			java.io.FileNotFoundException: nofile.txt (지정된 파일을 찾을 수 없습니다)
			finally~!!
			java.lang.NullPointerException : fis 객체는 현재 null입니다.
			프로그램을 정상 종료 합니다.
		 */
	}

}
