class With_returntype
{
	double circle()
	{
		int r=3;
		final double pi=3.142;
		double re=pi*r*r;
		return re;
	}
	int square()
	{
		int a=1;
		int re=a*a;
		return re;
	}
	int rectangle()
	{
		int w=1;
		int h=7;
		int re=w*h;
		return re;
	}
	int parallelogram()
	{
		int b=5;
		int h=6;
		int re=b*h;
		return re;
	}
	double triangle()
	{
		double aa=0.5;
		int b=8;
		int h=9;
		double re=aa*b*h;
		return re;
	}
	double trapezoid()
	{
		double aa=0.5;
		int a=1;
		int b=7;
		int h=9;
		double re=aa*(a+b)*h;
		return re;
	}
	double ellipse()
	{
		final double pi=3.142;
		int a=3;
		int b=4;
		double re=pi*a*b;
		return re;
	}
	double sector()
	{
		double aa=0.5;
		double t=22.2;
		int r=9;
		double re=aa*r*r*t;
		return re;
	}
	public static void main(String[] args)
	{
		System.out.println("Area of Circle");
		With_returntype t1=new With_returntype();
		double x=t1.circle();
		System.out.println(x);
		System.out.println("Area of Square");
		With_returntype t2=new With_returntype();
		int y=t2.square();
		System.out.println(y);
		System.out.println("Area of Rectangle");
		With_returntype t3=new With_returntype();
		int z=t3.rectangle();
		System.out.println(z);
		System.out.println("Area of Parallelogram");
		With_returntype t4=new With_returntype();
		int za=t4.parallelogram();
		System.out.println(za);
		System.out.println("Area of Triangle");
		With_returntype t5=new With_returntype();
		double zb=t5.triangle();
		System.out.println(zb);
		System.out.println("Area of Trapezoid");
		With_returntype t6=new With_returntype();
		double zc=t6.trapezoid();
		System.out.println(zc);
		System.out.println("Area of Ellipse");
		With_returntype t7=new With_returntype();
		double zd=t7.ellipse();
		System.out.println(zd);
		System.out.println("Area of Sector");
		With_returntype t8=new With_returntype();
		double ze=t8.sector();
		System.out.println(ze);
	}
}
