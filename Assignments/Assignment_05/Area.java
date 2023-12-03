class Area
{
	static void circle()
	{
		final double pi=3.142;
		double de=0.5;
		double te=31.7;
		int a=35;
		int b=68;
		int h=20;
		int r=10;
		int w=18;
		double result1=pi*r*r;
		System.out.println(result1);
		System.out.println(" ");
		System.out.println("Area of Triangle");
		double result2=de*b*h;
		System.out.println(result2);
		System.out.println(" ");
		System.out.println("Area of Rectangle");
		int result3=w*h;
		System.out.println(result3);
		System.out.println(" ");
		System.out.println("Area of Trapezoid");
		double result4=de*(a+b)*h;
		System.out.println(result4);
		System.out.println(" ");
		System.out.println("Area of Ellipse");
		double result5=pi*a*b;
		System.out.println(result5);
		System.out.println(" ");
		System.out.println("Area of Square");
		int result6=a*a;
		System.out.println(result6);
		System.out.println(" ");
		System.out.println("Area of Parallelogram");
		int result7=b*h;
		System.out.println(result7);
		System.out.println(" ");
		System.out.println("Area of Sector");
		double result8=de*r*r*te;
		System.out.println(result8);
	}
		public static void main(String[] args)
	{
		System.out.println(" ");
		System.out.println("Area of Cirlce");
		circle();
		System.out.println(" ");
	}
}