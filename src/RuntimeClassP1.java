
public class RuntimeClassP1 
{
	public static void main(String[] args) 
	{
		// fetch the object of Runtime from the JVM
		Runtime rt = Runtime.getRuntime();
		
		// show total memory
		System.out.println("total = "+rt.totalMemory());
		
		// show free memory
		System.out.println("free = "+rt.freeMemory());

		// calculate allocated memory
		System.out.println("allocated = "+(rt.totalMemory() - rt.freeMemory()));

		// max memory which can be availed by JVM from OS
		System.out.println("max = "+rt.maxMemory() / 1024 / 1024 + " MB");

		rt.exit(0);
	}
}