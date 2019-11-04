[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..)

# 상속 예제 

## [고객관리 프로그램](./CustomerTest.java)

- 고객의 등급에 따라 차별화된 서비스를 제공하고자 합니다.
- 고객의 등급에 따라 할인율, 적립금이 다르게 적용됩니다.
- [Customer](./Customer.java)를 상속받는 [VIP Customer](./VIPCustomer.java)와 [Gold Customer](./GoldCustomer.java)를 구현해봅시다.

### VIPCustome 클래스의 기능 

Customer 클래스와 유사하지만, 그보다 더 많은 속성과 기능이 필요([상속받아서 구현](./VIPCustomer.java#L12)

```
	단골 고객으로 해택이 더 다양해짐
	제품 구매시 10% 할인
	보너스 포인트 5% 적립
	담당 상담원 배정
```

### [오버라이딩 (Overriding)](./VIPCustomer.java#L21)

상위 클래스에 정의된 메서드의 구현된 내용이 하위 클래스에서 구현할 내용과 달라야 할 때, 하위 클래스에서 동이란 이름의 메서드를 재정의하는 행위 : [구현 테스트](./OverridingTest.java

```java
	// 예약어
	@Override
```
