# 자바 배열과 문자열
## 📦 자바 배열 정리

### 1. 배열의 특징
- 동일한 자료형의 데이터를 **연속된 공간**에 저장.
- 인덱스(index)를 통해 접근 (0부터 시작).
- 크기가 고정되어 있으며, 선언 시 크기를 지정해야 함.
 
** 배열구조 및 배열 초기화 값
<img width="540" alt="image" src="https://github.com/user-attachments/assets/da2e5b0a-2ed2-422d-8f7a-105e2c7e60a2" />

---  

<img width="540" alt="image" src="https://github.com/user-attachments/assets/88da4f50-3554-48ac-97f5-6585e3c675b5" />

  

### 2. 배열 선언 및 생성
```java
int[] arr = new int[5]; // 크기 5의 int 배열
```

### 3. 배열 초기화 방법
- **명시적 초기화**
```java
int[] arr = {10, 20, 30, 40, 50};
```
- **동적 초기화**
```java
int[] arr = new int[3];
arr[0] = 5;
arr[1] = 10;
arr[2] = 15;
```

---

## 🧩 1차원 배열 예제 3개

### 예제 1: 합계 구하기
```java
int[] nums = {1, 2, 3, 4, 5};
int sum = 0;
for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
}
System.out.println("합계: " + sum);
```

### 예제 2: 최대값 찾기
```java
int[] nums = {12, 7, 19, 3, 25};
int max = nums[0];
for (int i = 1; i < nums.length; i++) {
    if (nums[i] > max) {
        max = nums[i];
    }
}
System.out.println("최대값: " + max);
```

### 예제 3: 배열 값 출력
```java
String[] names = {"철수", "영희", "민수"};
for (int i = 0; i < names.length; i++) {
    System.out.println(names[i]);
}
```

---

## 🧵 문자열 핵심 메서드 예제

### 1. `equals` (문자열 비교)
```java
String a = "Hello";
String b = "Hello";
System.out.println(a.equals(b)); // true
```

### 2. `indexOf` (문자 위치 찾기)
```java
String str = "Java Programming";
System.out.println(str.indexOf("Pro")); // 5
```

### 3. `contains` (포함 여부 확인)
```java
String str = "I love Java";
System.out.println(str.contains("Java")); // true
```

### 4. `charAt` (특정 위치 문자)
```java
String str = "Apple";
System.out.println(str.charAt(0)); // 'A'
```

### 5. `replaceAll` (문자열 치환)
```java
String str = "2025-12-20";
System.out.println(str.replaceAll("-", "/")); // "2025/12/20"
```

### 6. `substring` (부분 문자열 추출)
```java
String str = "HelloWorld";
System.out.println(str.substring(0, 5)); // "Hello"
```

### 7. `toUpperCase` (대문자 변환)
```java
String str = "java";
System.out.println(str.toUpperCase()); // "JAVA"
```

### 8. `split` (구분자로 분리)
```java
String str = "사과,바나나,포도";
String[] fruits = str.split(",");
for (String f : fruits) {
    System.out.println(f);
}
```

---

## 📊 배열 초기화 방법 요약

| 방법             | 예시 코드                          | 특징 |
|------------------|-----------------------------------|------|
| 명시적 초기화    | `int[] arr = {1,2,3};`            | 값 직접 지정 |
| 동적 초기화      | `int[] arr = new int[3];`         | 크기만 지정 후 값 할당 |
| 반복문 초기화    | `for (int i=0; i<n; i++) arr[i]=i;` | 규칙적 값 할당 |

---

## 🧩 배열 초기화 응용 문제

**문제:** 크기 10의 배열을 생성하고, 1부터 10까지의 값을 순서대로 저장한 뒤 출력하시오.

### 풀이 코드
```java
int[] arr = new int[10];
for (int i = 0; i < arr.length; i++) {
    arr[i] = i + 1;
}
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```
**출력 결과:**  
```
1 2 3 4 5 6 7 8 9 10
```

---

👉 이렇게 정리하면 배열과 문자열의 핵심 개념을 모두 잡을 수 있습니다.  
원하시면 제가 **문자열 메서드를 배열과 함께 응용하는 문제**(예: 문자열 배열에서 특정 단어 찾기)도 추가로 만들어드릴 수 있어요.
