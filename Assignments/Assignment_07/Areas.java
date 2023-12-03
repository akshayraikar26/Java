class Areas
{
	static double circle()
	{
		int r=2;
	    final double pi=3.142;
	    double res=pi*r*r;
	    return res;
	}	
	static double triangle()
	{
		int b=5;
		int h=10;
		double aa=0.5;
		double res1=aa*b*h;
		return res1;
	}
	static int rectangle()
	{
		int w=20;
		int h=40;
		int res2=w*h;
		return res2;
	}
	static int square()
	{
		int a=20;
		int res3=a*a;
		return res3;
	}
	static int parallelogram()
	{
		int b=20;
		int h=2;
		int res4=b*h;
		return res4;
	}
	static double trapezoid()
	{
		int a=2;
		int b=4;
		int h=6;
		double aa=0.5;
		double res5=aa*(a+b)*h;
		return res5;
	}
	static double ellipse()
	{
		int a=2;
		int b=4;
		final double pi=3.142;
		double res6=pi*a*b;
		return res6;
	}
	static double sector()
	{
		int r=6;
		double aa=0.5;
		double the=36.4;
		double res7=aa*r*r*the;
		return res7;
	}
	public static void main(String[] args)
	{
		System.out.println("******Main Starts*******");
		System.out.println(" ");
		System.out.println("Area of Circle");
		double x=circle();
		System.out.println(x);
		System.out.println(" ");
		System.out.println("Area of Triangle");
		double y=triangle();
		System.out.println(y);
		System.out.println(" ");
		System.out.println("Area of Rectangle");
		int z=rectangle();
		System.out.println(z);
		System.out.println(" ");
		System.out.println("Area of Square");
		int t=square();
		System.out.println(t);
		System.out.println(" ");
		System.out.println("Area of Parallelogram");
		int s=parallelogram();
		System.out.println(s);
		System.out.println(" ");
		System.out.println("Area of Trapezoid");
		double q=trapezoid();
		System.out.println(q);
		System.out.println(" ");
		System.out.println("Area of Ellipse");
		double p=ellipse();
		System.out.println(p);
		System.out.println(" ");
		System.out.println("Area of Sector");
		double n=sector();
		System.out.println(n);
		System.out.println(" ");
		System.out.println("******Main Ends*******");
	}
}