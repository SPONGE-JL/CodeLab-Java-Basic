[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..)

# ArrayList

## 순서를 가지고 동일한 타입의 자료를 저장하는 자료 구조 

- JDK에서 구현해 둔 배열 형태의 리스트 자료형 (Collection Framework 중 하나)
- 순서를 가지고 크기변화가 가능한 자료구조

## [기초 사용법](./ArrayListTest.java#L12)

```java

	// 생성하기
	ArrayList<String> list = new ArrayList<String>();
	
	// 추가하기
	list.add("추가하기");
	
	// 출력하기
	list.get(0);
	
	// 자료형의 길이 확인하기
	list.size();

```

## [ArrayList로 구현하는 학생자료](./StudentTest.java#L7)

- 학생 객체는 이름과 학번을 가진다.
- 과목은 과목이름과 점수로 구성된다. 
- 학생은 여러 과목의 정보를 가진다.
- 학생 정보에 여러 과목정보를 입력하고, 출력을 하기 용이한 객체를 설계하자.