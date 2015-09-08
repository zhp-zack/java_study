import a.b.c.d1.*;
import a.b.c.d2.*;

public class Pack
{
	public static void main(String args[])
	{
		a.b.c.d1.Math m1 = new a.b.c.d1.Math(2, 2);
		a.b.c.d2.Math m2 = new a.b.c.d2.Math(2, 2);
		
		System.out.println(m1.add());
		System.out.println(m2.div());
	}
}
