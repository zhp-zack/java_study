
public class Hellow
{
	static public void main(String args[])
	{
		int a = 3;
		char b = 1;
		double c[] = new double[10];
		byte d = 6;
		boolean e = true;
		short f[] = {1,3,2};
		String h = "hellow, world!";
		double g = 3.22222;

		b = (char)(b + 1);

		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c[1]);
		System.out.println(d);
		System.out.println(e);
		System.out.println(h);
		System.out.println(g);

		c = null;
		f = null;
		h = null;
	}
}
