### :open_book:

[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..#ch05객체)

# static 변수

## [메모리, static, 변수...](./Student.java#6)

### static 변수

- 자바는 static으로 고정할 메모리를 반드시 클래스 내부에서 정의하도록 제한
- C의 글로벌 변수와는 역할이 다름 (외부에 별도 생성도 안되며, 유일한 생성도 아님)
- 프로그램 구동시 static 메모리(데이터 영역)을 점유, 프로그램 종료될 때 폐기
- 클래스의 멤버변수와 함께 선언하고, static을 명시하면 메모리에 로딩
  
### 인스턴스 변수 (멤버변수, 전역변수)

- 클래스가 인스턴스로 생성될 때 생성되는 변수 (인스턴스를 통해 참조 가능)
- 클래스 내부에서 static이 아닌 일반 변수(non-static 메소드에서 접근가능한 전역변수)
- 인스턴스 생성을 호출하는 callstack(호출스택)은 stack 메모리에서 인스턴스의 메모리를 참조
- 생성된 실제 인스턴스 메모리는 heap 메모리에 점유되어 참조
- 인스턴스 수명이 끝나면 callstack에서 지우고, GC(가비지컬렉터)가 heap메모리를 소거


### 지역변수 (로컬변수)

- 함수 내부에서 선언된 함수
- 함수 호출할 때 stack 메모리에서 생성
- 함수 호출이 끝나면 함수의 소멸과 함께 메모리 즉시 소거

<br/><div align="right"><b><a href="#open_book">↥ back to top</a></b></div><br/>

## [static 응용 : singleton pattern](./Company.java#L6)

### 싱글톤 : 단 하나만 존재하는 인스턴스 ([예제 결과](./CompanyTest.java#L10))

- `private` constructor(생성자)
- static으로 유일한 객체 생성
- 외부에서 유일한 객체를 참조할 수 있는 public static get()메서드 구현

<br/><div align="right"><b><a href="#open_book">↥ back to top</a></b></div><br/>
