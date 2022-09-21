package abc;

public class class07 {

	static class CTest{
		
		void test(int a) {
			if(a == 0) {
				System.out.println("此數為 0");
			}else if(a % 2 == 0) {
				System.out.println("此數為偶數");	
			}else {
				System.out.println("此數為奇數");	
			}
		
		}

	}
		
	public static void main(String[] args) {
		CTest a = new CTest();
		a.test(3);
		a.test(8);
		a.test(0);
	}

}
