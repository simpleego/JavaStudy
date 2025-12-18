## 🟢 기초 수준 문제 정답 코드 (10문제)

```java
import java.util.Scanner;

public class BasicProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 짝수/홀수 판별
        int num1 = sc.nextInt();
        if(num1 % 2 == 0) System.out.println("짝수");
        else System.out.println("홀수");

        // 2. 양수/음수/0 판별
        int num2 = sc.nextInt();
        if(num2 > 0) System.out.println("양수");
        else if(num2 < 0) System.out.println("음수");
        else System.out.println("0");

        // 3. 나이 판별
        int age = sc.nextInt();
        if(age >= 20) System.out.println("성인");
        else System.out.println("미성년자");

        // 4. 학점 판별
        int score1 = sc.nextInt();
        if(score1 >= 90) System.out.println("A");
        else if(score1 >= 80) System.out.println("B");
        else if(score1 >= 70) System.out.println("C");
        else System.out.println("F");

        // 5. 최댓값 (두 수)
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a > b) ? a : b);

        // 6. 최댓값 (세 수)
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int max = x;
        if(y > max) max = y;
        if(z > max) max = z;
        System.out.println(max);

        // 7. 요일 출력
        int day = sc.nextInt();
        switch(day) {
            case 1: System.out.println("월요일"); break;
            case 2: System.out.println("화요일"); break;
            case 3: System.out.println("수요일"); break;
            case 4: System.out.println("목요일"); break;
            case 5: System.out.println("금요일"); break;
            case 6: System.out.println("토요일"); break;
            case 7: System.out.println("일요일"); break;
            default: System.out.println("잘못된 입력");
        }

        // 8. 짝수/3의 배수 판별
        int num3 = sc.nextInt();
        if(num3 % 2 == 0 && num3 % 3 == 0) System.out.println("짝수이면서 3의 배수");
        else if(num3 % 2 == 0) System.out.println("짝수");
        else if(num3 % 3 == 0) System.out.println("3의 배수");
        else System.out.println("해당 없음");

        // 9. 합격/불합격
        int score2 = sc.nextInt();
        if(score2 >= 60) System.out.println("합격");
        else System.out.println("불합격");

        // 10. 문자 판별
        char ch = sc.next().charAt(0);
        if(Character.isUpperCase(ch)) System.out.println("대문자");
        else if(Character.isLowerCase(ch)) System.out.println("소문자");
        else if(Character.isDigit(ch)) System.out.println("숫자");
        else System.out.println("기타 문자");

        sc.close();
    }
}
```

- 조건문 연습에 최적화된 문제들이라, 반복문을 배우기 전 단계에서 충분히 활용 가능합니다.  

혹시 원하시면 제가 **각 문제별 실행 예시 입력/출력**도 정리해드릴까요?
