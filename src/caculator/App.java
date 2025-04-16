package caculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         while(true) {
             System.out.println("첫 번째 정수를 입력해 주세요");

             int a = sc.nextInt();

             System.out.println("두 번째 정수를 입력해 주세요");
             int b = sc.nextInt();
             if (b == 0) {
                 System.out.println("0은 입력이 안됩니다");
                 b = sc.nextInt();
             }
             System.out.println("사칙연산 기호를 입력하세요");

             char op = sc.next().charAt(0);
             if (op == '+') {
                 int result = a+b;
                 System.out.println("결과 값 : " + result);
             } else if (op == '-') {
                 int result = a-b;
                 System.out.println("결과 값 : " + result);
             } else if (op == '*') {
                 int result = (a*b);
                 System.out.println("결과 값 : " + result);
             } else if (op == '/') {
                 int result = (a/b);
                 System.out.println("결과 값 : " + result);
             }
             sc.nextLine();
             System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
             String end = sc.nextLine();


             if(end.equals("exit")){
                 System.out.println("종료되었습니다");
                 break;
             }

        }

    }
    }

