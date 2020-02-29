### :open_book:

[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..#ch08추상-클래스)

# 추상클래스 기본 활용

## 이해하기

- 클래스에 `abstract` 예약어를 붙여서 추상 클래스를 만들 수 있습니다. ([예시](./Computer.java#L6))
- 추상 클래스의 추상 메소드(abstract method)는 구현부가 없는 입출력이 정의된 메소드입니다.
- 추상 메소드의 구현의 책임은 하위 구현 클래스에 위임됩니다. ([예시](./Computer.java#L9))
- 추상 클래스도 구현 메소드(concrete method)를 가질 수 있습니다. ([예시](./Computer.java#L14))
- 만약 추상 클래스의 하위 클래스가 추상클래스인 경우 또다시 하위로 위임될 수 있습니다.

## 추상 클래스를 상속받는 구현체 클래스

- 구현체 클래스는 추상 클래스를 상속받아 구현한 클래스로, `extend` 예약어를 사용합니다. ([예시1](./DeskTop.java#6), [예시2](./LapTop.java#6))
- 구현체 클래스는 반드시 추상 클래스의 메서드를 모두 구현해야하는 책임이 따릅니다.(강제)  
 이때, 부모클래스인 **추상클래스의 메서드를 구현**해야하므로 `@Override` 예약어를 사용해야 합니다. ([예시1]./DeskTop.java#9, [예시2]./LapTop.java#9)  
 또한, 상위클래스인 **부모클래스에서 이미 정의된 구현 메소드를 재정의**해야 할 경우 역시 `@Override` 예약어를 사용해야 합니다. ([예시](./LapTop.java#20))
- 추상 클래스는 인스턴스로 생성이 될 수 없습니다. ([예시](./ComputerTest.java#L8))
- 구현체 클래스의 인스턴스는 구현체 클래스 타입이나 추상클래스 타입으로 생성될 수 있습니다. (다형성 / [예시](./ComputerTest.java#L11))
- [추상 클래스를 구현한 구현체 클래스 실행 예제](./ComputerTest.java#L3)를 참조해주세요.

<br/><div align="right"><b><a href="#open_book">↥ back to top</a></b></div><br/>
