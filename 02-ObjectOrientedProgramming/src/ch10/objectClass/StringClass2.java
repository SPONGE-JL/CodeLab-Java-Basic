package ch10.objectClass;

public class StringClass2 {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");

		System.out.println(java);
		System.out.println(System.identityHashCode(java));

		java = java.concat(android);

		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		/*
		 	[실행결과]
			java
			1311053135
			javaandroid
			118352462
			
			[이유]
			자바의 String클래스는 immutable(불변성)을 가지고 있기 때문에,
			이어 붙이는 경우 새로운 메모리주소에 연결하게 되고,
			이전에 할당한 메모리를 사용하지 않은 채 해제되지 않는 메모리 낭비를 발생시킨다.
			
			[해결하기]
			StringBuilder나 StringBuffer 클래스를 이용하여 이를 해결한다.
		 */
	}
}
