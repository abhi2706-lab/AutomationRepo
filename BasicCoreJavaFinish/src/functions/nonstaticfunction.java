package functions;

public class nonstaticfunction {

	public static void main(String[] args) {
		
		nonstaticfunction ref= new nonstaticfunction();
		
		ref.sum(10, 20);
		
		int add = ref.sum(10, 20);
		int add2= ref.sum(30, 40);
		
		System.out.println(add+add2);
		
		functionfirstclass.getname("Abhishek");
		
		
	}
	
	public int sum(int a, int b)
	
	{
		return a+b;
		
	}

}
