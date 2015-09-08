
public class Function
{
	public static void main(String args[])
	{
		int sum;

		sum = add(1, 2, 3);
		System.out.println(sum);
	}

	static int add(int a, int b)
	{
		return a + b;
	}

	static int add(int a, int b, int c)
	{
		return a + b + c;
	}
}
