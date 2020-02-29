[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..#9-문제 풀기-3)

# 문제 풀기 3

## 문제1

- [static + singleton pattern으로 카드회사 구현하기](./CardCompany.java#L3)

```
	카드회사가 있습니다.
	카드 회사는 유일한 객체이고, 이 회사에서는 카드를 발급하면 항상 고유번호가 자동으로 생성됩니다.
	10001부터 시작하여 카드가 생성될 때 마다 10002, 10003 으로 증가됩니다.
	다음 코드가 수행되도록 Card 클래스와 CardCompany 클래스를 구현해 보세요.
```

- [출력결과](./CardCompanyTest.java#L6)

```java
	public class CardCompanyTest {
	
		public static void main(String[] args) {
	
			CardCompany company = CardCompany.getInstance();
	
			Card myCard = company.createCard();
			Card yourCard = company.createCard();
	
			System.out.println(myCard.getCardNumber());   // 10001 출력
			System.out.println(yourCard.getCardNumber()); // 10002 출력
	
		}
	
	}
```