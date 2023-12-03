class With_parameter
{
	void circle(int r)
	{
		final double pi=3.142;
		double re=pi*r*r;
		System.out.println(re);
	}
	void sqaure(int a)
	{
		int re=a*a;
		System.out.println(re);
	}
	void triangle(int b,int h)
	{
		double aa=0.5;
		double re=aa*b*h;
		System.out.println(re);
	}
	void parallelogram(int b,int h)
	{
		int re=b*h;
		System.out.println(re);
	}
	void rectangle(int w,int h)
	{
		int re=w*h;
		System.out.println(re);
	}
	void trapezoid(int a,int b,int h)
	{
		double aa=0.5;
		double re=aa*(a+b)*h;
		System.out.println(re);
	}
	void ellipse(int a, int b)
	{
		final double pi=3.142;
		double re=pi*a*b;
		System.out.println(re);
	}
	void sector(int r)
	{
		double aa=0.5;
		double t=33.3;
		double re=aa*r*r*t;
		System.out.println(re);
	}
	public static void main(String[] args)
	{
		System.out.println("Area of circle");
		With_parameter s1=new With_parameter();
		s1.circle(4);
		System.out.println("Area of Square");
		With_parameter s2=new With_parameter();
		s2.circle(2);
		System.out.println("Area of Triangle");
		With_parameter s3=new With_parameter();
		s3.triangle(2,6);
		System.out.println("Area of Parallelogram");
		With_parameter s4=new With_parameter();
		s4.parallelogram(3,3);
		System.out.println("Area of Rectangle");
		With_parameter s5=new With_parameter();
		s5.rectangle(6,2);
		System.out.println("Area of Trapezoid");
		With_parameter s6=new With_parameter();
		s6.trapezoid(4,8,6);
		System.out.println("Area of Ellipse");
		With_parameter s7=new With_parameter();
		s7.ellipse(11,15);
		System.out.println("Area of Sector");
		With_parameter s8=new With_parameter();
		s8.sector(10);
	}
}