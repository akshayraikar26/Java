class Ari2
{
  static void ad()
    {
        int a=20;
        int b=20;
        int c=40;
        System.out.println(a+b+c);
    }
    static void su()
	{
		int a=200;
		int b=100;
		System.out.println(a-b);
	}
	static void mu()
	{
		int a=20;
		int b=40;
		System.out.println(a*b);
	}
	static void div()
	{
		int a=10;
		int b=2;
		System.out.println(a/b);
	}
	static void mod()
	{
		int a=10;
		int b=2;
		System.out.println(a%b);
	}
public static void main(String []args)
	{
        System.out.println(" ");
		System.out.println("Add");
		ad();
		System.out.println(" ");
		System.out.println("Sub");
		su();
		System.out.println(" ");
		System.out.println("Mul");
		mu();
		System.out.println(" ");
		System.out.println("Div");
		div();
		System.out.println(" ");
		System.out.println("Mod");
		mod();
		System.out.println(" ");
	}
}