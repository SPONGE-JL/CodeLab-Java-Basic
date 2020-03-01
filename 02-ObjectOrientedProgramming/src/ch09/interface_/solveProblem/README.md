### :open_book:

[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..#ch09인터페이스)

# 문제 풀기

## 문제

- 정렬의 3가지 종류인 버블 정렬, 힙 정렬, 퀵 정렬을 구현해봅니다.
- 오름차순과 내림차순 정렬이 모두 구현하며, 각 정렬은 서로 다른 과정을 거칩니다. (콘솔출력)
- 구현체 클래스를 생성하면 모두 '오름차순', '내림차순', '안내메시지'를 순서대로 수행합니다.

## 풀이

- **인터페이스**의 [추상 메서드](./Sort.java#L5)와 [디펄트 메서드](./Sort.java#L13)를 정의
- **인터페이스를 구현**한 [추상 클래스](./AbsSort.java#L3): 생성자에 디펄트 메서드 호출
- **추상 클래스를 상속**한 구현클래스([버블 정렬](./BubbleSort.java#L3)): 추상 메서드에서 **버블 정렬** 구현
- **추상 클래스를 상속**한 구현클래스([힙 정렬](./HeapSort.java#L3)): 추상 메서드에서 **힙 정렬** 구현
- **추상 클래스를 상속**한 구현클래스([퀵 정렬](./QuickSort.java#L3)): 추상 메서드에서 **퀵 정렬** 구현
- [테스트 클래스](./SortTest.java#37)

<br/><div align="right"><b><a href="#open_book">↥ back to top</a></b></div><br/>
