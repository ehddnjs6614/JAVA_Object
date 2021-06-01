package Test;

public class ObjectTest {

	public static void main(String[] args) {
			
		String data1 = new String("ABC");
		String data2 = new String("ABC");
		String data3 = "ABC";
		String data4 = "ABC";
		
		System.out.println(data1 == data2);
		System.out.println(data1.equals(data2));
		System.out.println(data3 == data4);
		System.out.println(data3.equals(data4));
		
		System.out.println(data3.hashCode());
		System.out.println(data4.hashCode());
	}
}
