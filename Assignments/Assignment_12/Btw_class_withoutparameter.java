class Areas
{
	void circle()
	{
		int r=3;
		final double pi=3.142;
		double re=pi*r*r;
		System.out.println(re);
	}
	void square()
	{
		int a=7;
		int re=a*a;
		System.out.println(re);
	}
	void rectangle()
	{
		int w=1;
		int h=4;
		int re=w*h;
		System.out.println(re);
	}
	void parallelogram()
	{
		int b=9;
		int h=5;
		int re=b*h;
		System.out.println(re);
	}
	void triangle()
	{
		double aa=0.5;
		int b=8;
		int h=9;
		double re=aa*b*h;
		System.out.println(re);
	}
	void trapezoid()
	{
		double aa=0.5;
		int a=1;
		int b=3;
		int h=2;
		double re=aa*(a+b)*h;
		System.out.println(re);
	}
	void ellipse()
	{
		final double pi=3.142;
		int a=4;
		int b=5;
		double re=pi*a*b;
		System.out.println(re);
	}
	void sector()
	{
		double aa=0.5;
		int r=1;
		double t=44.2;
		double re=aa*r*r*t;
		System.out.println(re);
	}
}
class Btw_class_withoutparameter
{
	public static void main(String[] args)
	{
		System.out.println("Area of Circle");
		Areas s1=new Areas();
		s1.circle();
		System.out.println("Area of Square");
		Areas s2=new Areas();
		s2.square();
		System.out.println("Area of Rectangle");
		Areas s3=new Areas();
		s3.rectangle();
		System.out.println("Area of Parallelogram");
		Areas s4=new Areas();
		s4.parallelogram();
		System.out.println("Area of Triangle");
		Areas s5=new Areas();
		s5.triangle();
		System.out.println("Area of Trapezoid");
		Areas s6=new Areas();
		s6.trapezoid();
		System.out.println("Area of Ellipse");
		Areas s7=new Areas();
		s7.ellipse();
		System.out.println("Area of Sector");
		Areas s8=new Areas();
		s8.sector();
	}
}