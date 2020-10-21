
public class Test {
	public static void main(String[] str) {
		try {
			double d1 = 1.0f / 0;
			System.out.println(d1);
			
			Double d2 = 1.0f / 0;
			System.out.println(d2);
		
		}
		
		catch(Exception e) {
			System.out.print("error");
		}
	}
}
