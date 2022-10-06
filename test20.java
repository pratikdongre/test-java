import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {
       // 구구단 출력 

       // 메뉴얼 먼저 화면 출력
       while(true){
        System.out.println("-------------");
        System.out.println("1. 구구단 출력");
        System.out.println("2. 프로그램 출력");
        System.out.println("-------------");
        //입력값 받기
        Scanner scn= new Scanner(System.in);
        int inputValue = scn.nextInt();
        //1번 입력시
        if(inputValue==1){
            System.out.println("출력할 구구단의 단을 입력하세요. 구구단의 단은 2~9 사이 입력");
        while(true){// 무한 반복을 쓰는 이유는 foo 값의 범위가 맞아 떨어 질때 까지 하기 위함이다
            
            // 구구단 값 출력
            int foo = scn.nextInt();
            if(foo>=2 && foo<=9){ // 2와 9사이의 단 출력
                for(int firstValue =1 ; firstValue<=9; firstValue++){
                    System.out.println(foo + "x" +firstValue + "="+(foo*firstValue));// 구구단의 식
                } break; // 브레이크를 걸어주는 이유는 foo 값의 범위가 맞으면 다른 구문으로 이동

                // 예외 처리
            }else{
                System.out.println("2~9사이 정수를 입력하세요"); //2와9사이 입력 하지 않을시
            }
            
        }  
        } else if(inputValue==2){
            System.out.println("이용해주셔서 감사합니다.");// 메뉴얼 에서 2번을 눌렀을때
            break; //
        }else{
            System.out.println("잘못 입력하셨습니다. 다시 입력하세요."); // 메뉴얼에서 1번과2번이 아닌 다른 수 입력시
        }
       }
    }
    }

     




