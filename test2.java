public class test2 {
    public static void main(String[] args) {
      int fisrtValue = 10;
      int secondValue = 3;

      float thirdValue = 10.0f;
      float forthValue = 3.0f;

      System.out.println(fisrtValue/secondValue); // 3 정수값
      System.out.println(thirdValue/forthValue); // 3.3333333 실수값
      System.out.println(fisrtValue/forthValue); // 3.3333333 실수값

      // 세번째 값이 이렇게 나오는 이유는자동 형변환 법칙으로 실수값이 나온다
    }
}
