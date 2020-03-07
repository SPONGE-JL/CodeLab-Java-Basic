### :open_book:

[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](../..#2-객체-지향-프로그래밍)

# Ch12.내부 클래스, 람다식, 스트림

## 내부클래스

클래스 내부에 구현한 클래스 (중첩된 클래스)  
클래스 내부에서 사용하기 위해 선언하고 구현하는 클래스로  
주로 외부 클래스 생성자에서 내부 클래스를 생성

| 종류 | 구현위치 |사용할수 있는 외부 클래스 변수 | 생성방법 |
| :------------- | :------------------- | :--------------------------- | :------------------------------- |
| [인스턴스 내부 클래스](./innerClass/InnerTest.java#L46) | 외부 클래스 멤버변수와 동일 | 외부 인스턴스 변수 <br> 외부 전역변수 | 외부 클래스를 먼저 만든 후 <br> 내부클래스 생성|
| [정적 내부 클래스](./innerClass/InnerTest.java#L64) | 외부 클래스 멤버변수와 동일 | 외부 전역 변수 | 외부 클래스와 무관하게 생성 |
| [지역 내부 클래스](./innerClass/LocalInnerClassTest.java#L25) | 메서드 내부에 구현 | 외부 인스턴스 변수<br> 외부 전역 변수 | 메서드를 호출할 때 생성 |
| [**익명 내부 클래스**](./innerClass/AnnoymousInnerClassTest.java#L24) | 메서드 내부에 구현 <br> 변수에 대입하여 직접 구현 | 외부 인스턴스 변수 <br> 외부 전역 변수 | 메서드를 호출할 때 생성되거나, 인터페이스 타입 변수에 대입할 때 new 예약어를 사용하여 생성 |

<div align="right"><b><a href= "#open_book">↥ back to top</a></b></div>

## 람다식

**자바에서 함수형 프로그래밍(Functional Programming)을 구현한 방식**  
**자바 8부터 지원**되는 기능으로, **클래스를 생성하지 않고 함수의 호출만으로 기능을 수행**  
매개변수와 **_함수형 인터페이스_**를 선언하여 사용됨 (내부적으로는 익명 클래스를 사용됨)

> Tip!  
> **함수형 프로그래밍**이란?  
> 순수 함수(Pure Function)를 구현하고 호출하는 프로그래밍 방식.  
> 매개 변수만을 사용하도록 만든 함수로 외부 자료에 부수적 영향(Side Effects)가 발생하지 않도록 설계됨.  
> 입력 받은 자료를 기반으로 수행되고 외부에 영향을 미치지 않으므로 병렬처리를 안정적이고 확장가능하게 실행함.

### 기초 문법

```java

// 매개변수는 괄호, 구현부는 중괄호로 감싸는 람다식 표준
// -> : 좌측 매개변수를 입력으로 우측 구현부를 수행한다는 애너테이션
(str) -> { System.out.println(str); }

// 매개변수가 하나인 경우, 괄호를 생략할 수 있음
str -> { System.out.println(str); }

// 구현부가 한 줄인 경우, 중괄호를 생략할 수 있음
str -> System.out.println(str);

// 리턴이 있는 경우는 생략이 불가능
str -> {return str;}

// 반환문만 존재하는 경우 return과 중괄호를 동시에 생략할 수 있음
str -> str.length();
(x,y) -> x + y

```

- [두 숫자의 합을 구하는 람다 예제](./lambda/MyMaxNumberTest.java#L13)
- [두 문자를 이어 붙이는 람다 예제](./lambda/MyConcatStringTest.java#L13)

### 람다식을 사용하는 3가지 방법

- [동일한 콜 스택에서 람다식을 구현한 후 사용하기](./lambda/HowToUseLambda_3way.java#L25)
- [상위 콜스택에서 람다식을 구현한 후 하위 콜스택(메서드)에서 사용하기](./lambda/HowToUseLambda_3way.java#L27)
- [하위 콜스택에서 람다식을 구현한 후 상위 콜스택에서 사용하기](./lambda/HowToUseLambda_3way.java#L31)

<div align="right"><b><a href= "#open_book">↥ back to top</a></b></div>

## 스트림(Stream)

자료의 대상과 관계없이 동일한 연산을 수행할 수 있는 기능(자료의 추상화)  
배열, 컬렉션에 **동일한 연산이 수행되어 일관성있는 처리 가능**

> 한번 생성하고 사용한 스트림은 재사용할 수 없음  
> 스트림 연산은 기존 자료를 변경하지 않음  
> 중간 연산과 최종 연산으로 구분되고, 최종 연산이 수행되어야 모든 연산이 적용되는 지연 연산이 있음  

### 중간 연산 

- `filter()`: 스트림 객체에 대해 입력된 람다식을 조건으로 요소 반환 연산 수행
- `map()`: 스트림 객체에 대해 입력된 람다식을 매핑하여 요소 반환 연산 수행
- (이 외에도 여러가지 중간 연산이 있음)

### 최종 연산

- `forEach()`: 꺼낸 요소에 대해 입력된 람다식 연산 수행
- `count()`: 꺼낸 요소의 개수를 세는 연산 수행
- `sum()`: 꺼낸 요소의 합 연산 수행
- (이 외에도 여러가지 최종 연산이 있음)

### 스트림 예제


```java

sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));
// 중간연산 filter() : 문자열의 길이가 5이상인 요소 추출
// 최종연산 forEach() : 각 요소로 출력


customerList.stream().map(c -> c.getName()).forEach(s-> System.out.println(s));
// 중간연산 map() : 고객 클래스에서 고객 이름만 추출
// 최종연산 forEach() : 각 요소로 출력

```

- [숫자 스트림 예제](./stream/IntArrayStreamTest.java#L11)
- [문자 스트림 forEach() 예제](./stream/ListStreamTest.java#L17)
- [문자 스트림 sort() 예제 ](./stream/ListStreamTest.java#L22)
- [문자 스트림 filter() 예제 ](./stream/ListStreamTest.java#L26)
- [문자 스트림 map() 예제 ](./stream/ListStreamTest.java#L30)


### reduce() 연산

정의된 연산이 아닌 프로그래머가 직접 지정하는 연산을 적용하는 스트림 메소드  
최종 연산으로 스트림의 요소를 소모하며 전달된 람다식 연산 수행  

```java

Arrays.stream(arr).reduce(0, (a, b) -> a + b);
// reduce(init, lambda)
  // init: 초기값
  // lambda: 전달되는 각 요소가 수행할 수행식

```

- [숫자 스트림 reduce() 예제](./stream/IntArrayStreamTest.java#L17)
- [문자 스트림 reduce() 예제 - 람다식 구현](./stream/ReduceTest.java#L16)
- [문자 스트림 reduce() 예제 - 메소드 구현](./stream/ReduceTest.java#L24)

<div align="right"><b><a href= "#open_book">↥ back to top</a></b></div>

## 연습 문제

```text

패키지 여행을 떠나는 고객들이 있습니다. 여행비용이 15세 이상은 100만원, 그 미만은 50만원이 책정되었습니다.
다음과 같이 고객 3명이 여행을 간다고 했을 때, 비용과 고객 명단에 대한 출력을 스트림을 활용하여 만들어 보세요.

<아래는 고객리스트입니다.>
```
|:---:|:---:|:---:|:---|

|고객번호 |고객이름 |고객나이 |여행비용  |
|  1  | Kim | 33  |100 |
|  2  | Min | 25  |100 |
|  3  | Hyo | 12  |50  |
|  4  |Sung | 27  |100 |
|  5  | Goo | 14  |50  |
|  6  |Hwang| 45  |100 |

<기능 요구사항>

1. [스트림을 활용하여 총 여행비용을 계산하기](./practice/Calcurator.java#L29)
2. [스트림을 활용하여 20세 이상인 사람의 이름을 오름차순으로 정렬된 고객명단을 출력하기](./practice/Calcurator.java#L35)

<br/><div align="right"><b><a href= "#open_book">↥ back to top</a></b></div><br/>
