class Areas
{
	void circle(int r)
	{
		final double pi=3.142;
		double re=pi*r*r;
		System.out.println(re);
	}
	void square(int a)
	{
		int re=a*a;
		System.out.println(re);
	}
	void rectangle(int w,int h)
	{
		int re=w*h;
		System.out.println(re);
	}
	void parallelogram(int b,int h)
	{
		int re=b*h;
		System.out.println(re);
	}
	void triangle(int b,int h)
	{
		double aa=0.5;
		double re=aa*b*h;
		System.out.println(re);
	}
	void trapezoid(int a,int b,int h)
	{
		double aa=0.5;
		double re=aa*(a+b)*h;
		System.out.println(re);
	}
	void ellipse(int a,int b)
	{
		final double pi=3.142;
		double re=pi*a*b;
		System.out.println(re);
	}
	void sector(int r)
	{
		double aa=0.5;
		double t=44.2;
		double re=aa*r*r*t;
		System.out.println(re);
	}
}
class Btw_class_withparameter
{
	public static void main(String[] args)
	{
		System.out.println("Area of Circle");
		Areas s1=new Areas();
		s1.circle(9);
		System.out.println("Area of Square");
		Areas s2=new Areas();
		s2.square(4);
		System.out.println("Area of Rectangle");
		Areas s3=new Areas();
		s3.rectangle(3,3);
		System.out.println("Area of Parallelogram");
		Areas s4=new Areas();
		s4.parallelogram(7,8);
		System.out.println("Area of Triangle");
		Areas s5=new Areas();
		s5.triangle(6,1);
		System.out.println("Area of Trapezoid");
		Areas s6=new Areas();
		s6.trapezoid(1,2,3);
		System.out.println("Area of Ellipse");
		Areas s7=new Areas();
		s7.ellipse(4,5);
		System.out.println("Area of Sector");
		Areas s8=new Areas();
		s8.sector(6);
	}
}