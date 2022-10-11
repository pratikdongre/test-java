import java.util.Scanner;


public class test20 {
    public static void main(String[] args) {
     // 구구단 구문 만들기

     // 메뉴얼 나타내기
     while(true){
        System.out.println("-----------------");
        System.out.println("1. 구구단 출력");
        System.out.println("2. 프로그램 종료");
        System.out.println("-----------------");

    // 입력값 받기
    Scanner scan = new Scanner(System.in);
    int inputValue = scan.nextInt();
    // 1번 정수 입력시

    if(inputValue==1){
        System.out.println("출력할 구구단의 단을 입력하세요. 구구단의 단은 2~9 사이 입력");
    // 출력할 구구단을 입력 받았을시
    while(true){ // 무한반복을 하는이유는 foo 값이 맞아 떨어지기 전까지 반복을 하기 위함
        int foo = scan.nextInt();
        if(foo>=2 && foo<=9){
            for(int firstValue= 1; firstValue<=9; firstValue++){
                System.out.println(foo + "x" + firstValue + "="+(foo*firstValue));
            }break;// 만약에 맞아 떨어졌다면 아래구문으로 이동

        // 예외 처리    
        }else{
            System.err.println("2~9사이 정수를 입력해주세요");
        }
    }
    }else if(inputValue==2){
        System.out.println("이용해주셔서 감사합니다");
        break;// 브레이크 를 거는 이유는 2번 입력시 완전히 종료를 시키기 위함
    }else{
        System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
    }
     }
     
    }
}

     




