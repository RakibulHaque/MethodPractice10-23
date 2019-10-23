
 class AddNumber
{
	public int add(int a,int b)
	
	{
		int sum = a+b;
		return sum;
	}
		
}



public class MethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddNumber callMethod = new AddNumber();
		
		int store = callMethod.add(4, 7);
		
		System.out.println("SUM of two number: "+store);
		
	}

}
