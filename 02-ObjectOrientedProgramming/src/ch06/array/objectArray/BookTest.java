package ch06.array.objectArray;

/*
 * 객체 배열 테스트
 */
public class BookTest {

	public static void main(String[] args) {
		
		// 객체 배열 생성 (책장만 생성된 상태, 책은 아직 생성되지 않았음)
		Book[] library = new Book[5];
		
		// 각 방에 객체를 생성하여 초기화
		library[0] = new Book("Java","Sun");
		library[1] = new Book("JavaScript","Netscape");
		library[2] = new Book("Node.js","Google");
		library[3] = new Book("book1","author1");
		library[4] = new Book("book2","author2");
		
		for (int i = 0 ; i < library.length ; i ++) {
			
			System.out.println(i + " : "+ library[i].getTitle() + " / " + library[i].getAuthor());
			
		}
		
	}
	
}
