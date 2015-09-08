
class Exc
{
	public static void main(String args[])
	{
		int ret = 0;
		int m = Integer.parseInt(args[0]);

		int n = Integer.parseInt(args[1]);

		System.out.println("Begin of div");
		try
		{
			ret = div(m,n);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			ret = 100;
			System.out.println("Go to finally");
		}
		System.out.println("End of div");

		System.out.println("m/n = " + ret);
	}

	private static int div(int m, int n) throws ArithmeticException
	{
		return m/n;
	}
}