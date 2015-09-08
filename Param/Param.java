
public class Param
{
	public static void main(String args[])
	{
		int a = 1;
		int p[] = new int[10];

		System.out.println("Before test2: " + p[0]);
		test2(p);
		System.out.println("After test2: " + p[0]);

		test(a);
		System.out.println(a);
	}

	static void test(int a)
	{
		a = 300;
	}

	static void test2(int[] p)
	{
		p[0] = 300;
	}
}
