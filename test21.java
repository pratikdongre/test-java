import java.util.Scanner;

public class test21 {
    public static void main(String[] args) {
      // 구구단 출력

      //메뉴얼 먼저 출력
    while(true){
      System.out.println("------------");
      System.out.println("1.구구단 출력");
      System.out.println("2. 프로그램 종료");
      System.out.println("------------");

      //입력 값 받기

      Scanner scan = new Scanner(System.in);
      int inputValue = scan.nextInt();
      //1을 입력시
      if(inputValue==1){
        System.out.println("출력할 구구단의 단을 입력하세요. 구구단의 단은2~9사이 입력");
        // 구구단이 화면에 출력
      while(true){ // 무한반복 시키는 이유는 foo 값이 맞을 때 무한 반복을 시키는 것이다
        int foo = scan.nextInt();
        if(foo>=2 && foo<=9){
            for(int firstValue = 1; firstValue<=9; firstValue++){
                System.out.println(foo + "x" + firstValue + "=" +(foo*firstValue));// 구구단 출력값
            } break; // 브레이크를 거는 이유는 foo 값이 범위 안에서 맞으면 다른 곳으로 출력 되게함

        // 예외 처리  
        }else{
            System.out.println("2~9사이 정수를 입력하세요"); // 범위 안에 숫자를 입력을 안했을시
        }
      }
      } else if(inputValue==2){
        System.out.println("이용해주셔서 감사합니다");// 2번 입력시 구구단 종료
        break; //브레이크를 만든 이유는 2번을 눌렀을때 실행이 종료되게 하기 위해서이다
      }else{
        System.out.println("잘못 입력하셨습니다. 다시 입력하세요."); // 1번과2 번이 아닌 다른 숫자를 메뉴얼에 입력시
      }


    }

    }
}

