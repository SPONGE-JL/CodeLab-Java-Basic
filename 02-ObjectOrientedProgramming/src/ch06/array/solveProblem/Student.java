package ch06.array.solveProblem;

import java.util.ArrayList;

/*
 * 학생 객체 : 학생의 정보와 학생이 읽은 도서 정보를 보관한다.
 */
public class Student {

	private String name;

	private ArrayList<Book> bookList;

	public Student(String name) {
		setName(name);
		bookList = new ArrayList<Book>();
	}

	public void addBookList(String bookName) {
		Book newBook = new Book(bookName);
		bookList.add(newBook);
	}

	public void printBookList() {

		System.out.print(getName() + " 학생이 읽은 책은 ");

		if (bookList.size() > 0) {

			for (Book book : bookList) {
				System.out.print("'" + book.getName() + "' ");
			}
			System.out.println("입니다.");

		} else {

			System.out.println("없습니다.");

		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
