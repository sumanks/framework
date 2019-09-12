package Variables;

public class local_variable {

	
	void add()
	{
		int a = 0;
		System.out.println(a);
		}
	
	public static void main(String[] args) {
		
		int a=10;
		System.out.println("Display the loacl variables " +a);
		
		local_variable ab = new local_variable();
		ab.add();

	}

}
