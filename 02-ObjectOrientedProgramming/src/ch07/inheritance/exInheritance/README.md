[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..#ch07상속과-다형성)

# 상속 예제 

## [고객관리 프로그램](./CustomerTest.java#L3)

- 고객의 등급에 따라 차별화된 서비스를 제공하고자 합니다.
- 고객의 등급에 따라 할인율, 적립금이 다르게 적용됩니다.
- [Customer](./Customer.java#L6)를 상속받는 [VIP Customer](./VIPCustomer.java#L6)를 구현해봅시다.

### VIPCustome 클래스의 기능 

Customer 클래스와 유사하지만, 그보다 더 많은 속성과 기능이 필요([상속받아서 구현](./VIPCustomer.java#L12)

```
	단골 고객으로 해택이 더 다양해짐
	제품 구매시 10% 할인
	보너스 포인트 5% 적립
	담당 상담원 배정
```

### [오버라이딩 (Overriding)](./VIPCustomer.java#L21)

상위 클래스에 정의된 메서드의 구현된 내용이 하위 클래스에서 구현할 내용과 달라야 할 때,  
하위 클래스에서 동일한 이름의 메서드를 재정의하는 행위

```java

	// 부모클래스의 정의된 메소드를 재정의하는 애너테이션(Annotation)
	@Override

```

[오버라이딩된 메서드를 실행하는 결과](./OverridingTest.java#L6)

### [형 변환](./OverridingTest.java#L15)

- 상위 클래스로의 묵시적 형변환(Upper Type Casting)
- 상위 클래 형으로 변수를 선언하고, 하위 클래스 인스턴스를 생성할 수 있다.
- 하위 클래스는 상위 클래스의 타입을 내포하고 있고, 사우이 클래스로 묵시적 형변환이 된다.
- 상속관계에서 모든 하위 클래스는 상위 클래스로 묵시적 형변환이 되지만, 역은 성립하지 않는다.

# 상속을 언제 사용할까?

## is-a 관계

> **일반적인(Genaral) 개념과 구체적인(Specific) 개념과의 관계**  
> 상위클래스 : 일반적인 개념 (예. 포유류)  
> 하위클래스 : 구체적인 개념 (예. 사람, 원숭이, 고래, etc.)  
> 공통된 속성을 모아서 하나의 타입으로 관리하고자 할때 유용

```java

	class Human extends Mammalia { }

	class Monkey extends Mammalia { }

	class Whale extends Mammalia { }

```

## has-a 관계

> **한 클래스가 다른 클래스를 소유하는 관계**  
> 단순 코드의 재사용성을 높이고자할 때 유용  
> Student는 다양한 Subject를 포함할 수 있습니다.

```java

	class Student {
		Subject subJava;
		Subject subPython;
		Subject subNodejs;
	}

```
