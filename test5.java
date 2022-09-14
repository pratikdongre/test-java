public class test5 {
    public static void main(String[] args) {
        // 접두사 접미사
        float boo = 2.2f; // 여기에서 뒤에 붙는 "f" 가 접두사고 접미사 가 2.2 이다
        
        long foo = 3L; // 명시적으로 long 형으로 지정 해둠

        float flo = 100.0;// 에러가 발생 하는 이유는long형이 float 메모리 범위를 못담기 때문이다  
    }
}
