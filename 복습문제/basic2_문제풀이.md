## 🔵 중급 수준 문제 정답 코드 (10문제)

```java
import java.util.Scanner;

public class IntermediateProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. BMI 계산기
        double height = sc.nextDouble(); // cm
        double weight = sc.nextDouble(); // kg
        double bmi = weight / Math.pow(height/100, 2);
        if(bmi < 18.5) System.out.println("저체중");
        else if(bmi < 23) System.out.println("정상");
        else System.out.println("과체중");

        // 2. 간단한 계산기
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char op = sc.next().charAt(0);
        switch(op) {
            case '+': System.out.println(n1+n2); break;
            case '-': System.out.println(n1-n2); break;
            case '*': System.out.println(n1*n2); break;
            case '/': System.out.println(n1/n2); break;
            default: System.out.println("잘못된 연산자");
        }

        // 3. 윤년 판별
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("윤년");
        else System.out.println("평년");

        // 4. 성적 등급 판별 (세분화)
        int score = sc.nextInt();
        if(score >= 90) {
            if(score >= 95) System.out.println("A+");
            else System.out.println("A-");
        } else if(score >= 80) {
            if(score >= 85) System.out.println("B+");
            else System.out.println("B-");
        } else if(score >= 70) {
            if(score >= 75) System.out.println("C+");
            else System.out.println("C-");
        } else if(score >= 60) System.out.println("D");
        else System.out.println("F");

        // 5. 삼각형 판별
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        if(s1+s2 > s3 && s1+s3 > s2 && s2+s3 > s1)
            System.out.println("삼각형 가능");
        else System.out.println("삼각형 불가능");

        // 6. 평균 합격 여부
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        double avg = (kor+eng+math)/3.0;
        if(avg >= 60 && kor >= 40 && eng >= 40 && math >= 40)
            System.out.println("합격");
        else System.out.println("불합격");

        // 7. 시간대 판별
        int hour = sc.nextInt();
        if(hour >= 0 && hour <= 11) System.out.println("오전");
        else if(hour <= 17) System.out.println("오후");
        else if(hour <= 20) System.out.println("저녁");
        else if(hour <= 23) System.out.println("밤");
        else System.out.println("잘못된 입력");

        // 8. 로그인 프로그램
        String id = sc.next();
        String pw = sc.next();
        if(id.equals("admin") && pw.equals("1234"))
            System.out.println("로그인 성공");
        else System.out.println("로그인 실패");

        // 9. 택시 요금 계산기
        int distance = sc.nextInt();
        int fare = 3000;
        if(distance > 10) fare += 1000;
        System.out.println("요금: " + fare);

        // 10. 성별/나이에 따른 요금 할인
        char gender = sc.next().charAt(0); // M/F
        int age2 = sc.nextInt();
        int baseFare = 10000;
        double finalFare = baseFare;
        if(gender == 'F') finalFare *= 0.8;
        else if(gender == 'M' && age2 >= 65) finalFare *= 0.7;
        System.out.println("최종 요금: " + (int)finalFare);

        sc.close();
    }
}
```
