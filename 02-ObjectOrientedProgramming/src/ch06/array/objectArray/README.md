### :open_book:

[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..#ch06배열)

# 객체 배열

## 순서를 가지는 동일한 타입의 **객체**를 저장하는 자료구조

- 원시형 자료구조의 배열은 선언과 동시에 초기화가 가능하다.  
- 그러나 참조형 자료구조의 배열은 선언시 크기를 결정한 뒤, 각 방에 객체를 초기화시켜야 한다.  
- 사용한 자료가 초기화되지 않을 경우 NullPointerException이 발생할 수 있으므로 주의  

## [객체 배열 예시](./BookTest.java)

## 얕은 복사와 깊은 복사

- [얕은 복사](./BookCopyTest1.java)  
	- 복사할 대상의 메모리 주소값을 복사하여 사본에 저장  
	- 원본이 바뀌면 사본도 변화

- [깊은 복사](./BookCopyTest2.java)  
	- 복사할 대상의 메모리데이터를 복사하여 사본에 저장(초기화)  
	- 원본이 바뀌어도 사본은 다른 메모리주소값으로 저장된 별도의 데이터이므로 변화 없음

<br/><div align="right"><b><a href="#open_book">↥ back to top</a></b></div><br/>
