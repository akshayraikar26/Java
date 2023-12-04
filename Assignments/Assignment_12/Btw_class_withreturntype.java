class Areas
{
	double circle()
	{
		int r=1;
		final double pi=3.142;
		double re=pi*r*r;
		return re;
	}
	int square()
	{
		int a=2;
		int re=a*a;
		return re;
	}
	int rectangle()
	{
		int w=3;
		int h=4;
		int re=w*h;
		return re;
	}
	int parallelogram()
	{
		int b=6;
		int h=5;
		int re=b*h;
		return re;
	}
	double triangle()
	{
		double aa=0.5;
		int b=8;
		int h=7;
		double re=aa*b*h;
		return re;
	}
	double trapezoid()
	{
		double aa=0.5;
		int a=8;
		int b=8;
		int h=2;
		double re=aa*(a+b)*h;
		return re;
	}
	double ellipse()
	{
		final double pi=3.142;
		int a=2;
		int b=3;
		double re=pi*a*b;
		return re;
	}
	double sector()
	{
		double aa=0.5;
		int r=4;
		double t=44.2;
		double re=aa*r*r*t;
		return re;
	}
}
class Btw_class_withreturntype
{
	public static void main(String[] args)
	{
		System.out.println("Area of Circle");
		Areas s1=new Areas();
		double x=s1.circle();
		System.out.println(x);
		System.out.println("Area of Square");
		Areas s2=new Areas();
		int y=s2.square();
		System.out.println(y);
		System.out.println("Area of Rectangle");
		Areas s3=new Areas();
		int z=s3.rectangle();
		System.out.println(z);
		System.out.println("Area of Parallelogram");
		Areas s4=new Areas();
		int s=s4.parallelogram();
		System.out.println(s);
		System.out.println("Area of Triangle");
		Areas s5=new Areas();
		double u=s5.triangle();
		System.out.println(u);
		System.out.println("Area of Trapezoid");
		Areas s6=new Areas();
		double v=s6.trapezoid();
		System.out.println(v);
		System.out.println("Area of Ellipse");
		Areas s7=new Areas();
		double w=s7.ellipse();
		System.out.println(w);
		System.out.println("Area of Sector");
		Areas s8=new Areas();
		double m=s8.sector();
		System.out.println(m);
	}
}