
class Person
{
	String name;
	String get_name()
	{
		return "Hubei " + name;
	}
};

public class Oop
{
	public static void main(String args[])
	{
		Person p1 = new Person();
		Person p2 = new Person();

		p1.name = "zhp";
		p2.name = "zack";

		System.out.println(p1.get_name());
		System.out.println(p2.get_name());
	}
}
