public class Person 
{
	int id, age;
	String name, city;
	
	static int nac = 0, prm1 = 0, prm2 = 0;
	
	Person()
	{
		nac++;
	}
	
	Person(int id ,String name)
	{
		this.id = id;
		this.name = name;
		prm1++;
	}
	
	Person(int id,String name,int age, String city)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		prm2++;
	}
	
	static void showObjectCounter()
	{
		System.out.println("nac = "+nac);
		System.out.println("prm1 = "+prm1);
		System.out.println("prm2 = "+prm2);
		System.out.println("total = "+(nac + prm1 + prm2));
	}
	
	public static void main(String[] args) 
	{
		Person.showObjectCounter();
		
		Person p1 = new Person();
		Person p2 = new Person(1,"");
		Person p3 = new Person(1,"",1,"");
		
		Person.showObjectCounter();
	}
	
}