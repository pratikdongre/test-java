import java.util.Scanner;



public class test20 {
  
    public static void main(String[] args) {
        // 구구단 값 출력 하기
    while(true){   

        // 메뉴 우선 출력
        System.out.println("------------");
        System.out.println("1. 구구단 출력");
        System.out.println("2. 프로그램 종료");
        System.out.println("------------");    
        
        //<키보드로 부터 정수값 입력>

        // 1을 입력 했을때 -> 구구단 출력
        Scanner scan =new Scanner(System.in);
        int inputValue = scan.nextInt();
    
    if(inputValue == 1){
            System.out.println("출력할 구구단의 값을 입력하세요.구구단은 2~9사이의 입력하시오");

        // 2와9 사이를 입력 했을때 그 구구단 이 출력 
        int foo =scan.nextInt();
        if(foo>=2 && foo<=9){
        
            for(int firstValue = 1; firstValue<=9;firstValue++){
                System.out.println(foo + "x" + firstValue + "=" + (foo*firstValue)); // 구구단의 식이 나오게끔 하는것
          }   
          }    
          else{
              System.out.println("2~9사이에 정수를 입력해주세요.");
          }   
           
          }
        else if(inputValue == 2){
           
            System.out.println("이용해주셔서 감사합니다");
            break;
        }

           // 선택지에서 1과2 이외 정수를 입력했을때
       else{
         System.out.println("잘못입력하셨습니다. 다시 입력하세요");
        }
   
        
    }
 

}


}
     




    





            







     
    


