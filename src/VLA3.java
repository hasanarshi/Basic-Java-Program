public class VLA3 
{
	static long doArithmeticOperations(int choice,long...var)
	{
		long result = 0L;
		System.out.println(
		(var.length == 2) ? 
		result = (choice == 1) ? var[0] + var[1] :(choice == 2) ? var[0] - var[1] :
			(choice == 3) ? var[0] * var[1] :(choice == 4 && var[1] != 0) ? var[0] / var[1] : 
				0L : "invalid arguments");
		return result;
	}
		
	public static void main(String[] args) 
	{
		long resposne = VLA3.doArithmeticOperations(4,4L,400L, 00L);
		
		System.out.println("response of method is "+resposne);
	}
}