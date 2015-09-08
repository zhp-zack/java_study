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

class Student extends Person
{
	private int classnum = 3;
	
	public int get_classnum()
	{
		return this.classnum;
	}
}

public class Ext1
{
	public static void main(String args[])
	{
		Student p1 = new Student();

		p1.set_age(28);

		System.out.println(p1.get_age());
		System.out.println(p1.get_classnum());
	}
}

