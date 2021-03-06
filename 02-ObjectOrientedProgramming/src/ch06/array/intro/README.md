### :open_book:

[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..#ch06배열)

# 배열이란

## 순서를 가지고 동일한 타입의 자료를 저장하는 자료 구조 

- 확정된 길이로 생성되는 방식 (fixed length)으로 물리적인 위치와 논리적인 위치가 동일하다.  
- 연속된 자료구조로, 비어있는 값을 허용하지 않는다.  
- 중간에 값을 끼워넣기 위해서는 기존 값을 다음칸으로 복사한 뒤에 넣고자 하는 값을 덧씌워야함  
- 첨자연산을 지원하므로 속도가 매우 빠르고, 배열의 인덱스(index)가 0부터 시작한다.  

## [다양한 선언 방법](./ArrayTest.java#L18)
```java
	// 선언 후 초기회 하는 방식
	// 자료형을 명시하고 이름을 두는 방식으로 선언하는 방식을 권장
	int[] arrA = new int[10];
	// 이 방법으로도 선언이 되지만, 가독성이 떨어진다. 
	int arrB[] = new int[10];
		
	// 선언과 동시에 초기화를 하는 방식
	// 선언과 동시에 초기화 하는 경우 방 크기는 생략된다.
	int[] arrC = new int[] {1,2,3};
	// 이 방법이 가장 많이 사용된다.
	int[] arrD = {4,5,6,7}; 
```

## [문자 배열 생성 및 출력하기](./ArrayCharTest.java#L11)

## [배열의 복사](./ArrayCopy.java#L13)


<br/><div align="right"><b><a href="#open_book">↥ back to top</a></b></div><br/>
