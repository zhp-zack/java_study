
class Test
{
	private int a = 3;

	class SubTest
	{
		void print()
		{
			System.out.println(a);
		}
	}
}

class Test1
{
	private static int a = 5;

	static class SubTest1
	{
		void print()
		{
			System.out.println(a);
		}
	}
}


public class Inner
{
	public static void main(String args[])
	{
		Test t = new Test();
		Test.SubTest s = t.new SubTest();

		Test1.SubTest1 s2 = new Test1.SubTest1();

		s.print();
		s2.print();
	}
}
