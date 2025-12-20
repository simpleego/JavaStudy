# 키보드 입력 처리
> 자바에서 사용자 입력을 처리하는 데 사용되는 **`Scanner` 클래스**에 대해 자세히 정리

---

##💻 Java `Scanner` 클래스 정리`java.util` 패키지에 포함된 `Scanner` 클래스는 **표준 입력(키보드)**이나 파일 등으로부터 **문자열이나 기본 자료형(정수, 실수 등)의 데이터를 읽어들이는(파싱하는) 데 사용**됩니다.

###1. 주요 특징* **위치:** `java.util.Scanner`
* **용도:** 텍스트를 파싱하여 기본 자료형 값과 문자열로 변환합니다.
* **표준 입력:** 가장 흔하게 `System.in` (표준 입력 스트림)을 인수로 받아 키보드 입력을 처리하는 데 사용됩니다.

###2. `Scanner` 객체 생성키보드 입력을 처리하기 위한 가장 일반적인 생성 방법입니다.

```java
import java.util.Scanner;

// Scanner 객체 생성 (System.in은 표준 입력 스트림을 의미)
Scanner scanner = new Scanner(System.in); 

```

<img width="600" height="400" alt="image" src="https://github.com/user-attachments/assets/91dbda27-6916-449f-a242-c3dcde72a69c" />


### 3. 주요 메서드  
| 메서드 | 반환 타입 | 설명 |
| --- | --- | --- |
| `nextInt()` | `int` | 입력 버퍼에서 **정수(integer)** 값을 읽어 반환합니다. |
| `nextDouble()` | `double` | 입력 버퍼에서 **실수(double)** 값을 읽어 반환합니다. |
| `next()` | `String` | 입력 버퍼에서 **다음 토큰(공백 이전까지의 문자열)**을 읽어 반환합니다. |
| `nextLine()` | `String` | 입력 버퍼에서 **줄 바꿈 문자(\n) 전까지의 모든 문자열**을 읽어 반환합니다. |
| `hasNext...()` | `boolean` | 다음에 읽을 토큰이 특정 타입(예: `hasNextInt()`, `hasNextLine()`)인지 확인합니다. |
| `close()` | `void` | `Scanner` 객체가 사용하던 시스템 자원을 **닫습니다**. (사용 후 반드시 호출하는 것이 좋습니다.) |

---

##📝 간단한 `Scanner` 예제 3가지###예제 1: 정수 입력받아 덧셈하기 (`nextInt()`)사용자로부터 두 개의 정수를 입력받아 합계를 출력하는 예제입니다.

```java
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt(); // 첫 번째 정수 입력

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt(); // 두 번째 정수 입력

        int sum = num1 + num2;
        System.out.println("두 수의 합계: " + sum);

        scanner.close(); // 자원 반환
    }
}

```

###예제 2: 이름과 나이 입력받기 (`next()` vs `nextInt()`)문자열(이름)과 숫자(나이)를 혼합하여 입력받는 예제입니다.

```java
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.next(); // 공백 이전의 문자열 (이름)

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt(); // 정수 (나이)

        System.out.println("안녕하세요, " + name + "님! 나이는 " + age + "살이시군요.");

        scanner.close();
    }
}

```

###예제 3: 한 줄 전체 입력받기 (`nextLine()`)공백을 포함한 문장을 통째로 입력받아 출력하는 예제입니다.

```java
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("좋아하는 문장을 입력하세요 (공백 포함 가능): ");
        // **주의: nextLine() 전에 nextInt()나 next()를 썼다면, 
        // 입력 버퍼를 비우기 위해 nextLine()을 한 번 더 호출해야 할 수 있습니다.**
        
        String sentence = scanner.nextLine(); // 줄 바꿈 전까지의 모든 입력

        System.out.println("당신이 입력한 문장: \"" + sentence + "\"");

        scanner.close();
    }
}

```

