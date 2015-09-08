class Person
{
	private int age = 0;

	public Person(int a)
	{
		System.out.println("Person2");
	}

	public Person()
	{
		System.out.println("Person1");
	}

	
	
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

	void test()
	{
		System.out.println("Test Person");
	}
};

class Student extends Person
{
	private int classnum = 3;

	public Student()
	{
		super();
	}

	public Student(int cn)
	{
		super(cn);
		classnum = 5;
		System.out.println("classnum: " + get_classnum());
	}
	
	public int get_classnum()
	{
		return this.classnum;
	}

	void test()
	{
		System.out.println("Test Student");
	}
}

public class Ext2
{
	public static void main(String args[])
	{
		Student p1 = new Student(88);

		p1.set_age(28);
		p1.test();

		System.out.println(p1.get_age());
		System.out.println(p1.get_classnum());
		
	}
}

