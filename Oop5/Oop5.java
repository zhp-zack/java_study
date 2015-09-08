class Person
{
	private int age = 0;
	
	void set_age(int age)
	{
		if(age < 0 || age > 200)
		{
			System.out.println("Warning: your input age is invalid, will be set to zero");
			age = 0;
		}
		else
		{
			this.age = age;
		}
	}

	
	int get_age()
	{
		return this.age;
	}
};

public class Oop5
{
	public static void main(String args[])
	{
		Person p1 = new Person();

		p1.set_age(258);

		System.out.println(p1.get_age());
	}
}

