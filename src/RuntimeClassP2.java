import java.util.Scanner;

public class RuntimeClassP2 
{
	public static void main(String[] args) 
	throws Exception
	{
		// fetch the object of Runtime from the JVM
		Runtime rt = Runtime.getRuntime();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a text: ");
		String text = sc.nextLine();
		
		rt.exec("c:\\windows\\system32\\"+text+".exe -l");
	}
}
