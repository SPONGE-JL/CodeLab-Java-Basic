### :open_book:

[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..#ch09인터페이스)

# 디펄트 메서드

## 구현체 클래스가 인터페이스를 구현할 때 가질 수 있는 기본 메서드 목록

- 구현체 클래스의 내부에서 정의된 일반 메서드
- 구현체 클래스가 구현한 인터페이스의 추상 메서드 `@Override`
	> 구현체 클래스의 **인터페이스에서 정의**된 추상 메서드  
	> 구현체 클래스의 **인터페이스 상위의 인터페이스에서 정의**된 추상 메서드  
	> 결국 인터페이스 정의된 추상메서드들은 **구현체에서 모두 구현**되어야 함  
	> 구현하지 않고 추상메서드형태로 내릴수 있음
- 구현체 클래스가  인터페이스의 디펄트 메서드를 `@Override`로 재정의

## 예제

오픈마켓의 경우, 사용자가 구매자와 판매자 모두가 될 수 있습니다. 이를 자바로 구현해봅니다.

- [Buy.java](./Buy.java#L7) - 인터페이스 : 구매 행위 설계  
- [Sell.java](./Sell.java#L7) - 인터페이스 : 판매 행위 설계  
- [Customer.java](./Customer.java#L3) - 구현체 클래스 : 구매/판매 행위를 구현하는 고객 클래스
- [CustomerTest.java](./CustomerTest.java#L24) - 테스트 클래스

<br/><div align="right"><b><a href="#open_book">↥ back to top</a></b></div><br/>
