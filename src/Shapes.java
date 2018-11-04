
public class Shapes 
{
	public void getArea(int w,int h)
	{
		System.out.println("area of rectangle is "+(w * h));
	}
	
	public void getArea(long s)
	{
		System.out.println("area of square is "+(s * s));
	}
	
	public void getArea(double r)
	{
		System.out.println("area of circle is "+3.14 * r * r);
	}
}