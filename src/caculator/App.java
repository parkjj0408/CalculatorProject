package caculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

         while(true) {
             System.out.println("첫 번째 정수를 입력해 주세요");

             int num1 = sc.nextInt();

             System.out.println("두 번째 정수를 입력해 주세요");
             int num2 = sc.nextInt();
             if (num2 == 0) {
                 System.out.println("0은 입력할 수 없습니다");
                 System.out.println("다시 입력해 주세요.");
                 num2 = sc.nextInt();
             }

             System.out.println("사칙연산 기호를 입력하세요");

             char op = sc.next().charAt(0);

             int result = calculator.calculate(num1, num2, op);
             System.out.println("결과 값 :" + result);

             sc.nextLine();
             System.out.println("더 계산하시겠습니까? 아무 글자나 입력해주세요.(exit 입력 시 종료)");
             String end = sc.nextLine();

             if(end.equals("exit")){
                 break;
             }

        }
        System.out.println("값 :" + calculator.getResult());
        calculator.removeResult();
    }
    }

