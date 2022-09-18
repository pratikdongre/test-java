public class test6 {
    public static void main(String[] args) {
        int foo = 2147483647; 
			
			System.out.println(foo);// 2147483647
			
			foo = foo + 1;
			
			System.out.println(foo);// -2147483648
			//위와 같은 값이 나오는 이유는 int 메모리값이 다 담을수 없기 때문에 음수값이 나온다
			
			
			foo = foo + 1;
			System.out.println(foo);// -2147483647
			// 위와 같이 같은 경우다
			// 오버 플로우 가 발생하는 이유는 내가 담은 그릇보다 더 큰값이 나오기 때문이다
			
			
    }
}
