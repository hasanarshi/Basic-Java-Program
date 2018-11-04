public class VLA2 
{
	static long doArithmeticOperations(int choice,long...var)
	{
		long result = 0L;
		
		if(var.length == 0)
		{
			System.out.println("arguments cant be zero");
		}
		else if(var.length < 2)
		{
			System.out.println("too few arguments");
		}
		else if(var.length > 2)
		{
			System.out.println("tto many arguments");
		}
		else
		{
		result = (choice == 1) ? var[0] + var[1] :(choice == 2) ? var[0] - var[1] :
			(choice == 3) ? var[0] * var[1] :(choice == 4 && var[1] != 0) ? var[0] / var[1] : 0L; 
		}
		return result;
	}
		
	public static void main(String[] args) 
	{
		long resposne = VLA2.doArithmeticOperations(4, 100L, 0L);
		
		System.out.println("response of method is "+resposne);
	}
}