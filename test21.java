import java.util.Scanner;

public class test21 {
    public static void main(String[] args) {
        //구구단을 출력
        //메뉴얼 먼저 출력
     while(true){
        System.out.println("------------------");
        System.out.println("1. 구구단 출력");
        System.out.println("2. 프래그램 종료");
        System.out.println("------------------");

        //출력값 받기 
        Scanner scan = new Scanner(System.in);
        int inputValue = scan.nextInt();
        // 1을 입력 했을때
        if(inputValue==1){
            System.out.println("출력할 구구단의 단을 입력하세요. 구구단의 단을 2~9 사이 입력");
        
        while(true){ //무한 반복을 쓰는 이유가 foo 값이 맞을때까지 계속 무한 반복한다
          int foo = scan.nextInt();
            if(foo>=2 && foo<=9){
                for(int firstValue =1; firstValue<=9; firstValue++){
                    System.out.println(foo + "x" + firstValue + "=" +(firstValue*foo));
                }
                break;// 여기에서 브레이크를 걸어주는 foo 값이 맞으면 밖으로 빠져 나가게 해줄려고 한것이다
            }else{
                System.out.println("2와9사이 정수를 입력해주세요");
            }

        }
        } else if(inputValue==2){
            System.out.println("이용해주셔서 감사합니다");
            break;
        } else{
            System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
        }
        } 
    }

    }
    


