class Without_parameter
{
	void circle()
	{
		int r=2;
		final double pi=3.142;
		double re=pi*r*r;
		System.out.println(re);
	}
	void triangle()
	{
		double aa=0.5;
		int b=2;
		int h=1;
		double re=aa*b*h;
		System.out.println(re);
	}
	void square()
	{
		int a=2;
		int re=a*a;
		System.out.println(re);
	}
	void rectangle()
	{
		int w=2;
		int h=4;
		int re=w*h;
		System.out.println(re);
	}
	void parallelogram()
	{
		int b=3;
		int h=7;
		int re=b*h;
		System.out.println(re);
	}
	void trapezoid()
	{
		double aa=0.5;
		int a=1;
		int b=3;
		int h=5;
		double re=aa*(a+b)*h;
		System.out.println(re);
	}
	void ellipse()
	{
		final double pi=3.142;
		int a=5;
		int b=7;
		double re=pi*a*b;
		System.out.println(re);
	}
	void sector()
	{
		double aa=0.5;
		double t=32.7;
		int r=2;
		double re=aa*r*r*t;
		System.out.println(re);
	}
	public static void main(String[] args)
	{
		System.out.println("Area of Circle");
		Without_parameter d1= new Without_parameter();
		d1.circle();
		System.out.println("Area of Triangle");
		Without_parameter d2= new Without_parameter();
		d2.triangle();
		System.out.println("Area of Square");
		Without_parameter d3= new Without_parameter();
		d3.square();
		System.out.println("Area of Rectangle");
		Without_parameter d4= new Without_parameter();
		d4.rectangle();
		System.out.println("Area of Parallelogram");
		Without_parameter d5= new Without_parameter();
		d5.parallelogram();
		System.out.println("Area of Trapezoid");
		Without_parameter d6= new Without_parameter();
		d6.trapezoid();
		System.out.println("Area of Ellipse");
		Without_parameter d7= new Without_parameter();
		d7.ellipse();
		System.out.println("Area of Sector");
		Without_parameter d8= new Without_parameter();
		d8.sector();
	}
}
