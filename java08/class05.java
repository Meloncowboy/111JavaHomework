package abc;

public class class05 {

	public static class CBox{
		int length;
		int width;
		int height;
		
		int volume() {
		    return length * width * height;
		}
		int surfaceArea() {
		    return length * width * 2 + length * height * 2 + width * height * 2;
		}
		void showData() {
			System.out.println("length= " +length);
			System.out.println("width= " +width);
			System.out.println("height= " +height);
		}
		void showAll() {
			showData();
			System.out.println("surfaceArea= " +surfaceArea());
			System.out.println("volume= " +volume());
		}
	}


	
	public static void main(String[] args) {
		CBox box = new CBox();
		box.length = 1;
		box.width = 1;
		box.height = 1;
		box.showAll();
		
//		System.out.println(box.myMethod());

	}
}
