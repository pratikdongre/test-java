public class test15 {
    static class A{
		public int id;
		A(int id){
			this.id=id;
		}
		
	}
	 class ReferenceDemol{
		public static void runValue() {
			int a = 1;
			int b = a;
			b=2;
			System.out.println("runValue,"+a);
		}
	}
	static void runReference() {
		A a= new A(1);
		A b= a;
		a.id=2;
		System.out.println("runReference,"+a.id);
		
		
	}
	

    public static void main(String[] args) {
        ReferenceDemol.runValue();
		runReference();
    }
    
}
