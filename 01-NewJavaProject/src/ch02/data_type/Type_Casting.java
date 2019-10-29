package ch02.data_type;

/*
 * 형변환 : 서로 다른 자료형의 값이 대입되는 경우 형을 변환하여 자료형을 맞추는 것
 * 
 * 1. 묵시적 형 변환(자동, implict type conversion)
 *  : 작은 수에서 큰 수로, 덜 정밀한 수에서 더 정밀한 수로 대입되는 경우
 * 
 * 2. 명시적 형 변환(수동, explict type conversion)
 *  : 변환되는 자료형을 명시하여 저장하는 경우. 자료의 손실 발생 가능성이 있음
 *
 *  
 * 묵시적 형변환 가능 (->)
 * 
 * 1. byte(1 byte) -> short(2 byte) -> int(4 byte) -> long(8 byte)
 * 2. char(2 byte) -> int(4 byte) -> long(8 byte)
 * 3. 정수 -> 실수
 * 4. float(4 byte) -> double(8 byte)
 */
public class Type_Casting {

	public static void main(String[] args) {

		// 묵시적 형변환 (implict type casting) 예시

		byte bNum = 10;
		int iNum = bNum; // byte -> int
		System.out.println("bNum = " + bNum); // 10
		System.out.println("iNum = " + iNum); // 10

		int iNum2 = 20;
		float fNum = iNum2; // int -> float
		System.out.println("fNum = " + fNum); // 20.0

		double dNum;
		dNum = fNum + iNum; // float -> double
		System.out.println("dNum = " + dNum); // 30.0

		// ---------------------------------------------------

		// 명시적 형 변환 (explict type casting) 예시

		int iNum3 = 1000;
		byte bNum2 = (byte) iNum3;
		System.out.println("\nbNum2 = " + bNum2); // -24 (손실)

		double dNum2 = 1.2;
		float fNum2 = 0.9F;

		int iNum4 = (int) dNum2 + (int) fNum2;
		int iNum5 = (int) (dNum2 + fNum2);
		System.out.println("iNum4 = " + iNum4); // 1 (손실)
		System.out.println("iNum5 = " + iNum5); // 2 (손실)

	}

}
