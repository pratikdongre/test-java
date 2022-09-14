public class test3 {
    public static void main(String[] args) {
        // 명시적 형변환
        // 명시적으로 지정해서 형변환을 시켜준다
        // 자동 형변환 이랑은 다른 원리다
        int fisrtValue = (int)100.0; 
        /*
         100이라는 상수가 int형이 아니지만 명시적으로 "int" 라고 설정 해주면 형변환이 이루진다
         */
        System.out.println(fisrtValue); // 값은 100이 나오지만 뒤에 실수값이 손실이 된다
    }
}
