import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);// 삼각형 
      
      double firstValue = a.nextDouble();
      double secondtValue = a.nextDouble();

      System.out.println(0.5*(firstValue*secondtValue));//삼각형 면적 구하기 공식 
    }
}
