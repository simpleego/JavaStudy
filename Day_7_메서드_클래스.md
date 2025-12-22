# 자바(Java)의 메서드
> 대표적인 **4가지 유형의 메서드**

# 📘 자바 메서드 정리

## 🔹 메서드란?
자바에서 **메서드(Method)**는 특정 작업을 수행하는 코드 블록이에요.  
입력값(매개변수)을 받을 수도 있고, 결과값(반환값)을 돌려줄 수도 있어요.

메서드는 크게 4가지 유형으로 나눌 수 있어요:

1. 매개변수 ❌ / 반환값 ❌  
2. 매개변수 ⭕ / 반환값 ❌  
3. 매개변수 ❌ / 반환값 ⭕  
4. 매개변수 ⭕ / 반환값 ⭕  

---

# 🧩 4가지 유형의 메서드 예제

아래 예제는 모두 `Calculator` 클래스 안에 있다고 가정할게요.

---

## 1️⃣ **매개변수 ❌ / 반환값 ❌**
아무 입력도 받지 않고, 아무 값도 돌려주지 않는 메서드  
→ 단순 실행용

```java
public void printHello() {
    System.out.println("Hello, Java!");
}
```

📌 **언제 사용?**  
- 단순 출력  
- 로그 남기기  
- 상태 초기화 등

---

## 2️⃣ **매개변수 ⭕ / 반환값 ❌**
입력은 받지만 결과를 반환하지 않는 메서드  
→ 입력값 기반으로 동작만 수행

```java
public void printNumber(int num) {
    System.out.println("입력한 숫자: " + num);
}
```

📌 **언제 사용?**  
- 전달받은 값으로 화면 출력  
- 객체 상태 변경  
- 파일 저장 등

---

## 3️⃣ **매개변수 ❌ / 반환값 ⭕**
입력은 없지만 결과를 반환하는 메서드  
→ 내부에서 계산하거나 값을 생성해 반환

```java
public int getRandomNumber() {
    return (int)(Math.random() * 100);
}
```

📌 **언제 사용?**  
- 랜덤 값 생성  
- 시스템 상태 조회  
- 기본값 반환 등

---

## 4️⃣ **매개변수 ⭕ / 반환값 ⭕**
입력도 받고 결과도 반환하는 가장 일반적인 형태  
→ 계산, 변환, 로직 처리에 가장 많이 사용

```java
public int add(int a, int b) {
    return a + b;
}
```

📌 **언제 사용?**  
- 계산  
- 데이터 변환  
- 조건 처리 후 결과 반환 등

---

# 🎯 전체 예제 클래스 형태로 정리

```java
public class Calculator {

    // 1. 매개변수 X, 반환값 X
    public void printHello() {
        System.out.println("Hello, Java!");
    }

    // 2. 매개변수 O, 반환값 X
    public void printNumber(int num) {
        System.out.println("입력한 숫자: " + num);
    }
ㄷ
    // 3. 매개변수 X, 반환값 O
    public int getRandomNumber() {
        return (int)(Math.random() * 100);
    }

    // 4. 매개변수 O, 반환값 O
    public int add(int a, int b) {
        return a + b;
    }
}
```

# 클래스 
> 클래스를 어떻게 만들고, 필드를 어떻게 초기화하며, 메서드를 어떻게 구성하는지
> 생성자 대신 사용할 **초기화 메서드(init 메서드)**

---

# 📘 자바 클래스 기초 정리 (생성자 없이)

## 🧱 1. 클래스(Class)란?
클래스는 **객체를 만들기 위한 설계도**야.  
클래스 안에는 다음 요소들이 들어가.

- **필드(Field)**: 객체의 속성(변수)
- **메서드(Method)**: 객체의 행동(함수)
- **toString() 메서드**: 객체 정보를 문자열로 표현하는 메서드
- (원래는 생성자도 포함되지만, 지금은 배우지 않았으므로 제외)

---

# 🧩 2. 생성자 대신 초기화 메서드 사용하기

생성자를 배우기 전에는 객체를 만든 뒤 값을 넣기 위해 **초기화 메서드(init 메서드)**를 사용해.

예)
```java
public void init(String name, int age) {
    this.name = name;
    this.age = age;
}
```

이 메서드는 원래 생성자가 하는 역할을 대신해주는 거야.

---

# 🖼️ 3. toString() 메서드란?

`toString()`은 객체의 정보를 문자열로 반환하는 메서드야.  
객체를 출력할 때 자동으로 호출돼.

예)
```java
@Override
public String toString() {
    return "Person{name='" + name + "', age=" + age + "}";
}
```

이렇게 하면 `System.out.println(person);`만 해도 사람이 읽기 좋은 형태로 출력돼.

---

# 🧱 4. 전체 예제로 정리한 클래스

아래는 생성자 없이 클래스를 구성하는 가장 기본적인 형태야.

```java
public class Person {

    // 1. 필드(속성)
    private String name;
    private int age;

    // 2. 초기화 메서드 (생성자 대신 사용)
    public void init(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 3. 행동 메서드
    public void sayHello() {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }

    // 4. toString() 메서드
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
```

---

# 🧪 5. 사용 예시

```java
public class Main {
    public static void main(String[] args) {
        Person p = new Person();  // 객체 생성
        p.init("jong", 25);       // 생성자 대신 초기화 메서드 사용

        p.sayHello();             // 메서드 호출
        System.out.println(p);    // toString() 자동 호출
    }
}
```

출력:
```
안녕하세요, 저는 jong입니다.
Person{name='jong', age=25}
```

---

# 🎯 핵심 요약

| 요소 | 설명 |
|------|------|
| **필드** | 객체의 속성(변수) |
| **메서드** | 객체의 행동 |
| **초기화 메서드(init)** | 생성자 대신 필드 초기화 |
| **toString()** | 객체 정보를 문자열로 반환 |

---
