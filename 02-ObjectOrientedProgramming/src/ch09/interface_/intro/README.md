[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..)

# 인터페이스 

## 개념 

- **추상 메서드**만으로 구성된 클래스  
	- `abstract` 예약어 없이 내부에 선언된 모든 메서드는 추상 메서드로 자동 변환됨  
	- 추상 클래스는 `new` 예약어를 사용할 수 없음, 즉 인스턴스로 바로 생성할 수 없음  
	- 추상 클래스는 구현 클래스를 통해서 구현한 뒤에 인스턴스로 사용할 수 있음  
	- **인터페이스를 구현할 클래스의 명세(설계될 프로그램 기능 리스트를 내장하도록 명시)**
- 인터페이스를 구현하는 구현체 클래스(Concrete Class)의 **중복구현을 막기 위한 요소**  
	- 상수  
	- 디폴트 메소드 (Default Method)  
	- 정적 메소드 (Static Method)  
	- 프라이빗 메소드 (Private Method)  