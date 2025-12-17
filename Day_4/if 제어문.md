좋습니다 👍 자바에서 **if문**은 크게 세 가지 기본 형식으로 나눌 수 있습니다. 각각을 정리하고 간단한 예제를 보여드릴게요.

---

## 🟢 1. 단일 if문
- **형식**: 조건이 참일 때만 실행.
- 가장 기본적인 형태.

```java
if (조건식) {
    실행문;
}
```

**예제**
```java
int age = 20;
if (age >= 18) {
    System.out.println("성인입니다.");
}
```

---

## 🟡 2. if-else문
- **형식**: 조건이 참일 때와 거짓일 때를 나누어 실행.
- 두 가지 경우를 처리할 때 사용.

```java
if (조건식) {
    실행문1;
} else {
    실행문2;
}
```

**예제**
```java
int number = 5;
if (number % 2 == 0) {
    System.out.println("짝수입니다.");
} else {
    System.out.println("홀수입니다.");
}
```

---

## 🔵 3. if-else if-else문
- **형식**: 여러 조건을 순차적으로 검사.
- 조건이 많을 때 사용.

```java
if (조건식1) {
    실행문1;
} else if (조건식2) {
    실행문2;
} else {
    실행문3;
}
```

**예제**
```java
int score = 75;
if (score >= 90) {
    System.out.println("A 학점");
} else if (score >= 80) {
    System.out.println("B 학점");
} else if (score >= 70) {
    System.out.println("C 학점");
} else {
    System.out.println("D 학점");
}
```

---

## ✨ 요약

| 형식              | 특징 | 사용 상황 |
|-------------------|------|-----------|
| **단일 if문**     | 조건이 참일 때만 실행 | 단순 조건 검사 |
| **if-else문**     | 참/거짓 두 경우 처리 | 양자택일 상황 |
| **if-else if문**  | 여러 조건 순차 검사 | 조건이 여러 단계로 나뉠 때 |

---

## 🔵 조건(삼항) 연산자란?
- **형식**:  
  ```java
  조건식 ? 참일 때 값 : 거짓일 때 값
  ```
- **특징**:
  - `if-else` 문을 간단히 표현할 수 있음.
  - 값 자체를 반환하기 때문에 변수에 바로 대입 가능.
  - 간단한 조건 분기에 적합.

---

## 🧩 사용 예제 1: 나이 판별
```java
public class TernaryExample1 {
    public static void main(String[] args) {
        int age = 20;
        String result = (age >= 18) ? "성인" : "미성년자";
        System.out.println(result);  // 출력: 성인
    }
}
```
👉 `if-else` 대신 간단히 성인/미성년자 판별.

---

## 🧩 사용 예제 2: 짝수/홀수 판별
```java
public class TernaryExample2 {
    public static void main(String[] args) {
        int number = 7;
        String result = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);  // 출력: 홀수
    }
}
```
👉 수학적 조건을 간단히 표현.

---

## 🧩 사용 예제 3: 최대값 구하기
```java
public class TernaryExample3 {
    public static void main(String[] args) {
        int a = 10, b = 15;
        int max = (a > b) ? a : b;
        System.out.println("최대값: " + max);  // 출력: 최대값: 15
    }
}
```
👉 두 값 중 큰 값을 간단히 선택.

---

## ✨ 요약
| 사용 상황 | 예시 | 장점 |
|-----------|------|------|
| 단순 분기 | 성인/미성년자 | 코드 간결 |
| 값 판별   | 짝수/홀수 | 직관적 |
| 선택 연산 | 최대값, 최소값 | 변수 대입에 유용 |

---
