### :open_book:

[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..#ch09인터페이스)

# 인터페이스와 다형성

## 예제

	- 고객 센터에는 전화 상담을 하는 상담원들이 있습니다.
	- 고객 센터로 전화가 오면 대기열에 저장됩니다. 전화는 **상담원이 지정되기 전까지 대기 상태**가 됩니다.
	- **각 전화가 상담원에게 배분되는 정책**은 다음과 같이 여러 방식으로 구현될 수 있습니다.
		> 상담원 순서대로 배분하기
		> 대기가 짧은 상담원 먼저 배분하기
		> 우선순위가 높은(숙련도가 높은) 상담원에게 먼저 배분하기
	- 위와 같은 다양한 정책이 사용되는 경우 **interface를 정의**하고 다양한 **정책을 구현**하여 실행하세요.

## 풀이
  - **정책 명세를 정의**한 인터페이스 ([**_interface_** Scheduler](./Scheduler.java#L6)) 
    > 대기 전화 찾기: `public void getNextCall();`  
    > 대기 전화 분배: `public void sendCallToAgent();`
  - **정책1.** 상담원 순서대로 배분 ([**_class_** RoundRobin **_implements_** Scheduler](./RoundRobin.java#L6))
  - **정책2.** 대기가 짧은 상담원 먼저 배분 ([**_class_** LeastJob **_implements_** Scheduler](./LeastJob.java#L6)])
  - **정책3.** 우선순위가 높은 상담원에게 먼저 배분([**_class_** PriorityAllocation **_implements_** Scheduler](./PriorityAllocation.java#L6))
  - **구현결과 실행** ([SchedulerTest.java](./SchedulerTest.java#L5))
    > 인터페이스 타입으로 선언된 각 구현체클래스에서 [구현된 기능을 호출](./SchedulerTest.java#L33)합니다.  
    > 기능의 명세만 보고 해당 기능을 호출하여 사용 가능합니다.  

### 짚고 넘어가기

점점 방대해지는 프로그램의 모든 코드를 사람이 모두 눈으로 따라간다는 것은 애초에 불가능 하며,  
설계된 각 메소드, 클래스 패키지 단위가 이상이 없이 동작할 때, 내부 모든 절차가 아닌 기능만 이해하면 됩니다.

이 연장선상에서 수많은 라이브러리들의 메서드들은 어떤 행위와 입출력이 이루어 지는지만 알면 사용할 수 있습니다.  
이것이 가능한 이유는 API를 인터페이스로 설계했기 때문이며  API 기능만 이해하면 되기 때문입니다.  
구현의 책임을 API를 구현하는 메소드에 일임하였기 때문에 호출하는 입장에서는 과정과 결과만 신용할 수 있으면 되므로  
내부 로직의 모든 코드를 볼 필요가 없습니다.

<br/><div align="right"><b><a href="#open_book">↥ back to top</a></b></div><br/>
