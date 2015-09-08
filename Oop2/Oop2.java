class Person
{
	String name;
	String get_name()
	{
		return "Hubei " + name;
	}

	public Person(String n)
	{
		name = n;
	}
};

public class Oop2
{
	public static void main(String args[])
	{
		Person p1 = new Person("zhp");
		Person p2 = new Person("zack");

		System.out.println(p1.get_name());
		System.out.println(p2.get_name());
	}
}

