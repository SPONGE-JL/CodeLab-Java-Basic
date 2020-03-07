### :open_book:

[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](../..#2-객체-지향-프로그래밍)

# Ch13.예외 처리

## 오류와 예외 클래스

- **오류(Error)**: 가상 머신에서 발생된 오작동으로 프로그램에서 처리할 수 없는 영역.  
  ex. 동적메모리를 모두 사용한 경우의 `stack over flow` etc.
- **예외(Exception)**: 프로그램에서 제어할 수 있는 영역으로 예외사항에 대한 처리 수행이 가능  
  ex. 읽으려는 파일이 없는 경우, 네트워크나 소켓 연결 오류 etc.

### 오류의 종류

- 컴파일 오류(Compile Error): 프로그램 코드 작성 중 발생하는 문접적 오류 (IDE에서 컴파일러로 확인)
- 런타임 오류(Runtime Error): 실행중인 프로그램이 의도하지 않은 동작을 하거나(bug) 프로그램이 중지되는 오류

자바는 JVM을 통해 메모리 직접 접근을 막은 컴파일 언어이므로,
**`예외 처리`**를 통하여 런타임 오류로 인한 프로그램의 비정상 종료를 막고 로그(log)를 남길 수 있음

<div align="right"><b><a href="#open_book">↥ back to top</a></b></div>

## 예외 처리 기초

```java

try {
  // 예외가 발생할 수 있는 코드 블럭
} catch (Exception e) {
  // 예외 타입에 해당하는 예외가 해당했을 때 수행되는 코드 블럭
} finally {
  // 예외 발생 여부와 상관없이 항상 수행되는 코드 블럭
  // 주로 리소스를 해제하는 코드가 위치
}

```
- `catch(e) { }`블럭은 try 블럭부터 finally 블럭 사이에 순서대로 걸 수 있다.
- 예외는 작은 것부터 큰 것 순서대로 걸어 준다.
- `catch(ExcptionType1 e1 | ExcptionType2 e2) { }` 형태로 다중 예외처리가 가능하다.

### 예제

- [예외가 발생하는 예제](./exception/ArrayExceptionTest.java#L9)
- [try-catch 블록 예제](./exception/FileExceptionTest.java#L12)
- [AutoClosable 구현으로 자동 소거를 사용하는 구문(Java 8 이상)](./exception/FileExceptionTest2.java#L14)
- [AutoClosable Override로 실제 수행확인는 예제](./exception/AutoClosable.java#L7)

<div align="right"><b><a href="#open_book">↥ back to top</a></b></div>

## [예외 처리 미루기](./exception/ThrowsException.java#L9)

- `throws`를 사용하여 예외가 발생한 메서드에서 예외를 처리하지 않고, 메서드를 호출한 곳에서 예외를 처리한다.
- 메서드 선언 부에 throws를 추가하면 `try{ }` 블럭으로 예외를 처리하지 않고 예외 처리를 미룬다.
- `main()`메서드 에서 `throws`를 사용하면 가상머신에서 처리된다.

<div align="right"><b><a href="#open_book">↥ back to top</a></b></div>

## 예외 사용자 정의

```text
매개변수로 전달된 아이디가 null이거나 8 미만 혹은 20자 초과인 경우 예외를 발생시키는 예외 클래스
```

- [예외 정의](./practice/IDFormatException.java#L4)
- [예외 발생](./practice/IDFormat.java#L7)
- [예외 처리](./practice/IDFormatTest#L11)

<br/><div align="right"><b><a href="#open_book">↥ back to top</a></b></div><br/>