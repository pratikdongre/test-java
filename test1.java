import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      
      double fisrtValue = scn.nextDouble();
      double secondValue = scn.nextDouble();

      System.out.println(0.5*(fisrtValue*secondValue));
      //삼각형 면적 구하기 공식(2분의1 * 밑변 * 높이)
    }
}
