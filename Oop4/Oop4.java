class Person
{
	String name;
	int age = 0;
	static int count = 0;
	
	String get_info()
	{
		return "Hubei " + name + ",age:" + age;
	}

	public Person(String name)
	{
		this.count++;
		this.name = name;
		this.print_count();
	}

	public Person(String name, int age)
	{
		this.count++;
		this.name = name;
		this.age = age;
		this.print_count();
	}

	static void print_count()
	{
		System.out.println("count = " + count);
	}

	{
		System.out.println("haha");
	}

	static 
	{
		System.out.println("static haha");
	}
};

public class Oop4
{
	public static void main(String args[])
	{
		Person p1 = new Person("zhp", 28);
		Person p2 = new Person("zack", 28);

		System.out.println(p1.get_info());
		System.out.println(p2.get_info());

		Person.print_count();
	}
}

