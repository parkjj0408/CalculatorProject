package caculator; // 쓰일 멤버변수 // 사칙연산을 수행하는 메서드


import java.util.ArrayList;
import java.util.List;

public class Calculator {
  private List<Integer> results = new ArrayList<>();// 연산결과를 저장하는컬렉션 타입  필드 선언 및 생성


  public int calculate(int num1, int num2, char op) {
    int result;

    switch (op) {
        case '+':
          result = num1 + num2;
          results.add(result);//인덱스 안에 넣기 성공 ?
          return result;

        case '-':
          result = num1 - num2;
          results.add(result);
          return result;


        case '*':
          result = num1 * num2;
          results.add(result);
          return result;

        case '/':
          if (num2 != 0) {
            result = num1 / num2;
            results.add(result);
            return result;

          } else {
            System.out.println("0은 입력하실 수 없습니다.");

          }

      default:
        throw new IllegalArgumentException("지원하지 않는 연산자입니다");
    }



  }

  public List<Integer> getResult() {
    return results;
  }
  //public void clearResult(){ 값 초기화 메서드
  // results.clear();
  // }

  public void removeResult() {
    // 삭제된 값을 보여주기 위해 변수에 저장.
    if (!results.isEmpty()) {
      int removedValue = results.remove(0);
      System.out.println("삭제된 값 : " + removedValue);
      //먼저 입력된 값 삭제 list.remove(인덱스 번호)
    }
  }
}

