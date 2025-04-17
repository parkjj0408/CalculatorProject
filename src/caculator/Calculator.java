package caculator; // 쓰일 멤버변수 // 사칙연산을 수행하는 메서드


import java.util.ArrayList;

public class Calculator {
  private ArrayList<Integer> results = new ArrayList<Integer>();// 연산결과를 저장하는컬렉션 타입  필드 선언 및 생성

  public int calculate(int num1, int num2, char op) {
    switch (op) {
      case '+':
        results.add(num1 + num2); //인덱스 안에 넣기 성공 ?
        return num1 + num2;

      case '-':
        results.add(num1 - num2);
        return num1 - num2;


      case '*':
        results.add(num1 * num2);
        return num1 * num2;

      case '/':
        if (num2 == 0) {
          System.out.println("0은 입력하실 수 없습니다.");
        } else
          results.add(num1 / num2);
        return num1 / num2;

      default:
        throw new IllegalArgumentException("기호 입력이 잘못 되었습니다");
    }
  }

  public ArrayList<Integer> getResult() {
    return results;
  }

  public void removeResult() {
    int removedValue = results.remove(0); // 삭제된 값을 보여주기 위해 변수에 저장.
    if (!results.isEmpty()) {
      System.out.println("삭제된 값 : " + removedValue);
      results.remove(0);//먼저 입력된 값 삭제 list.remove(인덱스 번호)
    }
  }
}

