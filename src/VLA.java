public class VLA 
{
	public void fx(int a,int...b) // ... known as  elipses, 
	// jis method ke paramter mai inko use kiya jata hai us method ko var-args method
	// kaha jata hai
	{
		System.out.println("method executes with "+b.length+" arguments");
	}
	
	public static void main(String[] args) 
	{
		VLA ref = new VLA();
		
		ref.fx(1);
		
		ref.fx(100,200,300);

		ref.fx(1,2,3,4,5,6,7,8,9,10);
		
		int[] ary = {100,200,300,400,500};
		
		ref.fx(100,ary);

	}
}