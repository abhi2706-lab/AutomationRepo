package functions;

public class functionfirstclass {

	public static void main(String[] args) {
		
		sum();
		
		int add=sum(30,40);
		
		int add2=sum(50,60);
		
		System.out.println(add+add2);
		
		String a=getname("Abhishek");
				System.out.println(a);
				
				
				
	}
		
	

	public static void sum()
	{
		
	int a=10;
	int b=20;
	
	System.out.println(a+b);
}
	
	


public static int sum(int a, int b)

{
	return a+b;
	
	
}

public static String getname(String name)

{
return "Your Name is"+name;
	

}

public static String eligibility(int age)

{
	if(age>=18 && age<=30)
		
		return"You are eligible";
	
	else
		
		return"Yor are not eligible";
	
	
			
}
}
