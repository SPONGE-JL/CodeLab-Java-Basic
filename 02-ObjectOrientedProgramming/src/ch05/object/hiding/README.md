[Go Home](https://github.com/devJRL/CodeLab-JAVA-Basic#codelab-java-basic) / [Go Up](..#ch05객체)

# 정보 은닉

## [접근제어자](./MyDateTest.java#L20)

> [`public`](./MyDate.java#L6) : 클래스 외부까지 모든 접근 허용  
> [`private`](./MyDate.java#L26) : 클래스 내부에서의 접근 허용, `정보 은닉 구현가능`  
> `protected` : 상속받은 상위클래스를 하위클래스에서만 접근가능하도록 허용  
> `(명시하지않음, default)` : 같은 패키지 내부에서만 접근할 수 있는 상태 (서로 다른 패키지에서는 접근 불가)

## `this`에 대한 이해

- [생성자에서 다른 생성자를 호출할 때](./ThisExample.java#L14)
- 자기 자신 객체를 가리킴 ([자기자신의 메모리 주소값 반환](./ThisExample.java#L24))
