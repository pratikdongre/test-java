import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {
        // 구구단 값 출력 하기
       while(true){
        //메뉴얼 출력
        System.out.println("----------");
        System.out.println("1.구구단 출력");
        System.out.println("2. 프로그램 출력");
        System.out.println("----------");

        //입력값 받기
        Scanner scan= new Scanner(System.in);
        int inputValue = scan.nextInt();
        //1번 입력시
        if(inputValue==1){
            System.out.println("출력할 구구단의 단을 입력하세요. 구구단의 단은2~9사이");
        while(true){// 여기에 무한 반복을 쓰는 이유는 범위가 계속 맞을때 까지 foo값을 무한으로 반복
        int foo = scan.nextInt();
        if(foo>=2 && foo<=9){
            for(int firstValue = 1 ; firstValue<=9; firstValue++){
                System.out.println(foo + "x" + firstValue + "="+ (foo*firstValue));
        //1번 을 입력시 구구단의 식이 나온다 ex) 3을 입력시 3의 구구단 이 나옴          

            }
            break;
            
        // 그런데 2와9사이 정수를 입력 하지 않을 시에는 다음 과 같은 값이 출력됨     
         }else{
            System.out.println("2~9사이 정수를 입력해주세요"); // 2~9사이 정수를 입력해주세요
         }
        }

    }    // 2번버튼을 누를시에는 프로그램이 종료가 된다
    else if(inputValue==2){
        System.out.println("이용해주셔서 감사합니다");
        break;

        // 메뉴얼 창에서 1과2가 아닌 수를 입력하면 다음과 같은 화면이 출력된다
    }else{
        System.out.println("잘못 입력하셨습니다 다시 입력하세요.");
    }
    
    }
 }
 }
     




