class Person
{
	private int age = 18;
	
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

	public void test()
	{
		System.out.println("Test Person");
	}

};

interface A
{
	public static int a = 3;
	
	public abstract void print_val();
}

class Student extends Person implements A
{
	private int classnum = 3;

	public Student()
	{
		super();
	}

	public int get_classnum()
	{
		return this.classnum;
	}

	
	
	public void test()
	{
		System.out.println("test Student");
	}

	public void print_val()
	{
		//System.out.println("test Student");
	}
}

public class Ext6
{
	public static void main(String args[])
	{
		Student s = new Student();
		Person p = new Person();

		Person p2 = new Student();
		Student s2 = (Student)p2;
		

		//p.test();
		//s2.test();

		printinfo(p);
		printinfo(s);
	}

	public static void printinfo(Person p)
	{
		p.test();
	}
}

