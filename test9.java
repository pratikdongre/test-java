
        // FishCake 클래스를 정의
class FishCake {
   
    // Member variable (멤버변수)
    String name;
    
    // Member method (멤버메서드)
    void prtNameOfFish() { // 함수의 자료형이 없다 -> 자료값이 없다 클래스 내의 있는 함수를 메소드라고 한다
       System.out.println(name);
    }
    
    // Constructor (생성자)
    FishCake() {
       System.out.println("초기화 작업이 실행 됩니다");
    }
 }
 
 
 public class test9 {
    public static void main(String args[]) {
       
       FishCake obj1 = new FishCake();
       
       obj1.name = "1번 붕어빵";
             
       FishCake obj2 = obj1;
       
       obj2.prtNameOfFish();
       
       
 
    }
    
}
