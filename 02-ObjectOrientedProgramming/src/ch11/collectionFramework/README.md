### :open_book:

[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](../..#2-객체-지향-프로그래밍)

# Ch11.컬렉션 프레임워크 (Collection Framework)

C 언어의 Standard Library와 대응되는 Java 진영의 표준 자료구조 패키지를 의미합니다.  
**`java.util`** 패키지에 위치하는 이 클래스들은 최적화된 알고리즘으로 자료구조를 제공합니다.  
JDK에서 제공하는 이 자료구조를 통해서 더 빠르고 안전한 프로그래밍이 되도록 돕습니다.

## 1. 제네릭 프로그래밍

- 변수의 선언이나 메서드의 매개변수를 하나의 참조 자료형이 아닌 여러 자료형을 변환될 수 있도록 프로그래밍하는 방식  
- 실제 사용되는 참조 자료형의 변환은 컴파일러가 검증하므로 안정적인 프로그래밍을 사용 가능

### [자료형 매개 변수 T](./GenericPrinter.java#L19)
- 여러 잠초 자료형으로 대체 될 수 있는 부분을 하나의 문자로 표현  
- Type을 의미하는 T로 사용 

<div align="right"><b><a href="#open_book">↥ back to top</a></b></div>

## 2. 개념

- 프로그램 구현에 필요한 자료구조와 알고리즘을 구현해 놓은 라이브러리  
- java.util 패키지에 구현되어 있음  
- 개발에 소요되는 시간을 절약하고 최적화된 라이브러리를 사용할 수 있음  
- Collection 인터페이스와 Map 인터페이스로 구성됨  

<div align="right"><b><a href="#open_book">↥ back to top</a></b></div>

### Collection Interface

> 하나의 객체를 관리하기 위해 선언된 인터페이스로 필요한 기본 메서드가 선언되어 있음  
> **Collection**  
> > **List** : 순서가 있는 자료 관리, 중복 허용  
> > - capacity(용량): 자료구조의 최대 적재 가능한 데이터 양
> > - size(크기): 자료구조에 실재 적재된 데이터 양
> > > **ArrayList**  : Array를 이용하여 구현되며, 확장과 탐색에 최적화된 자료구조  
> > > **Vector** : 멀티스레드에서 동기화(synchronized) 지원  
> > > **LinkedList** [예제](./list/LinkedListTest.java#L9) : 노드와 다음 노드의 연결을 이용하여, 수정에 최적화된 자료구조  
> > **Set** : 순서가 없는 자료관리, *중복 불허*  
> > - 순서가 없으므로 get(i) 메서드가 제공되지 않음  
> > - 모든 콜렉션이 가지는 [iterator 객체를 이용한 순회](./set/HashSetTest.java#L20)  
> > > [HashSet](./set/HashSetTest.java#L10)
> > > - [사용자  데이터를 중복없이 저장하는 **해쉬셋** 예제](./set/MemberHashSetTest.java#L75)
> > > TreeSet : 중복을 허용하지 않으면서 [오름차순](./treeset/TreeSetTest.java#L10)이나 [내림차순](./treeset/TreeSetTest2.java#L21)으로 객체를 정렬하는 자료형 (이진 검색 트리로 구현)  
> > > - [사용자 데이터를 중복없이 저장하는 **트리셋** 예제](./treeset/MemberHashSetTest.java#L75)
> > > - Comparable 인터페이스로 객체 비교할때 구현해야하는 [compareTo() 메소드](./common/Member.java#L58)
> > > - Comparator 인터페이스로 객체 비교할떄 구현해야하는 [compare() 메소드](./common/Member.java#L64)
<div align="right"><b><a href="#open_book">↥ back to top</a></b></div>

### Map Interface

> 키-값의 형태로 쌍을 이루는 객체를 관리하는데 필요한 기본 메서드가 선언되어 있음
> **Collection**  
> > **Map** : 키-값(key-value) 쌍으로 되어 있고, *key의 중복 불허*  
> > hash() 메소드를 이용하여 탐색(검색)에 효율적인 자료구조  
> > > HashTable <- Properties  
> > > HashMap  
> > > TreeMap  

### etc.

- **[Stack](./list/StackTest.java)** : ArrayList로 구현해보는 Stack (Last In First Out)
- **[Queue](./list/QueueTest.java)** : ArrayList로 구현해보는 Queue (First In First OUt)
  > **_Tip!_** [Queue 및  LinkedList는 Queue 인터페이스로 구현되어 있습니다.](https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html)
- Tree : Java에서 객체 정렬에 사용되는 클래스
- Binary Tree : Node의 하위 Node가 둘 이하로 정렬된 자료구조
- Binary Search Tree : 기준에 따라 좌/우 2가지로 정렬하여 검색되는 자료구조

<br/><div align="right"><b><a href="#open_book">↥ back to top</a></b></div><br/>