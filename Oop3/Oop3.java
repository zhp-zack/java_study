class Person
{
	String name;
	int age = 0;
	
	String get_info()
	{
		return "Hubei " + name + ",age:" + age;
	}

	public Person(String name)
	{
		this.name = name;
	}

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
};

public class Oop3
{
	public static void main(String args[])
	{
		Person p1 = new Person("zhp", 28);
		Person p2 = new Person("zack", 28);

		System.out.println(p1.get_info());
		System.out.println(p2.get_info());
	}
}

