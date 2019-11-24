[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..)

# Ch11.컬렉션 프레임워크(Collection Framework : Standard Library of Java)

## 1. 제네릭 프로그래밍

- 변수의 선언이나 메서드의 매개변수를 하나의 참조 자료형이 아닌 여러 자료형을 변환될 수 있도록 프로그래밍하는 방식  
- 실제 사용되는 참조 자료형의 변환은 컴파일러가 검증하므로 안정적인 프로그래밍을 사용 가능

### [자료형 매개 변수 T](./GenericPrinter.java)
- 여러 잠초 자료형으로 대체 될 수 있는 부분을 하나의 문자로 표현  
- Type을 의미하는 T로 사용 

## 2. 개념

- 프로그램 구현에 필요한 자료구조와 알고리즘을 구현해 놓은 라이브러리  
- java.util 패키지에 구현되어 있음  
- 개발에 소요되는 시간을 절약하고 최적화된 라이브러리를 사용할 수 있음  
- Collection 인터페이스와 Map 인터페이스로 구성됨  

### Collection Interface

> 하나의 객체를 관리하기 위해 선언된 인터페이스로 필요한 기본 메서드가 선언되어 있음  
> **Collection**  
> > **List** : 순서가 있는 자료 관리, 중복 허용  
> > > ArrayList  ₩
> > > Vector - 멀티스레드에서 동기화 지원  
> > > LinkedList - Queue 인터페이스를 이용하여 구현  
> > > [Stack](./StackTest.java)  
> > > Queue
> > **Set** : 순서가 없는 자료관리, *중복 불허*  
> > > [HashSet](./HashSetTest.java)  
> > > [TreeSet](./TreeSetTest.java) - 중복을 허용하지 않으면서 오름차순이나 내림차순으로 객체를 정렬하는 자료형 (이진 검색 트리로 구현)  

### Map Interface

> 키-값의 형태로 쌍을 이루는 객체를 관리하는데 필요한 기본 메서드가 선언되어 있음
> **Collection**  
> > **Map** : 키-값(key-value) 쌍으로 되어 있고, *key의 중복 불허*  
> > > HashTable <- Properties  
> > > HashMap  
> > > TreeMap  