public class test11 {
    public static void main(String[] args) {
        // int bar =10;

        // bar++;
        // System.out.println(bar);// 후위형

        // ++bar;
        // System.out.println(bar);// 전휘형

        // System.out.println(bar++); //12 가 나오는 이유는 후위 형은 이앞에 값이 끝나야 증가가된다
        // System.out.println(++bar); // 그래서 수식한값이 끝나면서 증가가 되기때문에 14가 나온다
        // //세미콜론을 기준으로 식이 끝나야 증가가 된다



        int bar2 = 20;
        int foo2= 0;

        foo2= --bar2; // 먼저 감소 가 된다
        System.out.println("foo2:"+foo2+",bar2:"+bar2);

        foo2= bar2--;// 전체 수식을 다계산 하고 값이 나온다
        System.out.println("foo2:"+foo2+",bar2:"+bar2);


    }
    
}
