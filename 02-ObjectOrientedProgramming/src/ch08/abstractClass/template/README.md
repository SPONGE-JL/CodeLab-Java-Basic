[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..#ch08추상-클래스)

---

# 템플릿 메서드 패턴

## 템플릿 메서드

**추상 메서드나 구현된 메서드를 활용해서 전체의 흐름(시나리오, 로직)을 정의해 놓은 메서드**를 의미합니다.  
`final`로 선언하여 해당 메서드를 재정의할 수 없도록 강제할 때 사용합니다.

## 템플릿 메서드 패턴

디자인패턴의 일종으로, 프레임워크에서 많이 사용되는 설계 패턴 중 하나입니다.
추상 클래스로 선언된 상위 클래스에서 추상메서드를 이용하여 전체 구현의 흐름을 정의하고
구체적인 각 메서드 구현은 하위 클래스에 위임하는 방식으로,
**하위 클래스가 다른 구현을 했다고 해도 템플릿 메서드에 정의된 시나리오 대로 수행되도록 설계하는 패턴**입니다.

## 예약어 **final**

- **`final {variable}`** : 값이 고정되는 상수를 선언 (선언될때만 할당되고 변경 불가)  
- **`final {method}`** : 하위 클래스에서 재정의(Overriding) 불가  
- **`final class`** : **더이상 상속될 수 없음** (ex. String 클래스)

## [입문 예제](./CarTest.java#L13)

> [동일한 작동시나리오](./Car.java#L20)로 설계된 차량 기능을  
> [자율주행차량](./AICar.java#L6)과 [인간주행차량](./ManualCar.java#L6)에서  
> 일부 구현만 다르게 하는 과정을 구현한 예제입니다.

## [활용 예제](./PlayerTest.java)

> [Player](./Player.java#L3)가 있고, Player가 게임을 합니다.  
> 게임에서 [Player가 가지는 레벨](./PlayerLevel.java#L6))에 따라 `run, jump, turn` 세 가지 기능을  수행할 수 있어야 합니다.  
> 각 레벨에 따른 능력치는 다음과 같습니다.

> [초급](./BeginnerLevel.java#L3) : **천천히** 달립니다 (run)  
> [중급](./AdvancedLevel.java#L3) : **빠르게** 달리고(run), 점프(jump)를 할 수 있습니다.  
> [고급](./SuperLevel.java#L3) : **매우 빠르게** 달리고(run), 점프(jump)를 할 수 있으며, **한 바퀴 돌 수** 있습니다.(turn)  

> [플레이어는 `go` 명령을 받으면 이 세가지 기능을 위 순서대로 동일하게 수행합니다.](./PlayerLevel.java#L18)  
> 만약 레벨에 따라  [수행할  수 없는 경우, 수행할 수 없다는 메시지를 보여줍니다.](./BeginnerLevel.java#L12)

<br/><div align="right"><b><a href="#----">↥ back to top</a></b></div><br/>
