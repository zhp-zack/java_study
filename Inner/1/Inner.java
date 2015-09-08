
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

public class Inner
{
	public static void main(String args[])
	{
		Test t = new Test();
		Test.SubTest s = t.new SubTest();

		s.print();
	}
}
