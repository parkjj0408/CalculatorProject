package caculator; // 쓰일 멤버변수 // 사칙연산을 수행하는 메서드

public class Calculator {
    String s;
    int a;
    int b;

    int add(int a, int b) {//더하기
        int result = a + b;
        return result;
    }

    int substract(int a, int b) {
        int result = a - b;
        return result;
    }
     int multiply(int a, int b){
        int result = (a*b);
        return result;
     }
     int divide(int a, int b){
        int result = (a/b);
        return result;
     }
}
