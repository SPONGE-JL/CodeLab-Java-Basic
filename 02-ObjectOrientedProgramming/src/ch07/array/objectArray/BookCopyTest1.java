package ch07.array.objectArray;

/*
 * 객체 배열 테스트 :얕은 복사
 */
public class BookCopyTest1 {

	public static void main(String[] args) {
		
		// 객체 배열 생성 (책장만 생성된 상태, 책은 아직 생성되지 않았음)
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		// 각 방에 객체를 생성하여 초기화
		library[0] = new Book("Java","SunMicroSystem");
		library[1] = new Book("JavaScript","Netscape");
		library[2] = new Book("Node.js","Google");
		library[3] = new Book("book1","author1");
		library[4] = new Book("book2","author2");
		
		System.out.println("\n얕은 복사");
		// 객체 복사 (얕은 복사로 주소값을 복사시킴)
		System.arraycopy(library, 0, copyLibrary, 0, copyLibrary.length);
		
		// 향상된 for문 : 처음부터 끝까지 돌릴때, 자료구조의 원소를 기준으로 모두 탐색시키는 데에 유용
		for (Book book : copyLibrary) {
			book.showInfo();
		}
		
		// 원본 객체의 값 변조
		library[0].setTitle("자바");
		library[0].setAuthor("선마이크로시스템");
		library[1].setTitle("자바스크립트");
		library[1].setAuthor("넷스케이프");
		library[2].setTitle("노드");
		library[2].setAuthor("구글");
		library[3].setTitle("북1");
		library[3].setAuthor("저자1");
		library[4].setTitle("북2");
		library[4].setAuthor("저자2");
		
		
		System.out.println("\n변조된 원본 객체");
		for (Book book : library) {
			book.showInfo();
		}
		System.out.println("\n얕은 복사 된 사본 객체");
		// 원본 객체의 값을 변조시키면, 객체복사된 값도 변조 (얕은 복사)
		// 데이터를 복제하는 것이 아닌 주소값을 복사해줬기 때문
		for (Book book : copyLibrary) {
			book.showInfo();
		}
		
	}
	
}
