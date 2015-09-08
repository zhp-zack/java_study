
interface A
{
	abstract public void printInfo();
}


public class Inner
{
	public static void main(String args[])
	{
		myPrint(new A() {
			public void printInfo(){
				System.out.println("My test");
			}
		}
		);
	}

	public static void myPrint(A t)
	{
		t.printInfo();
	}
}
