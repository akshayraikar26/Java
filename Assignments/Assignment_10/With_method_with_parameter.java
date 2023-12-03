class With_method_with_parameter
{
	void circle(int r)
	{
		final double pi=3.142;
		double re=pi*r*r;
		System.out.println(re);
	}
	void triangle(int b, int h)
	{
		double aa=0.5;
		double re=aa*b*h;
		System.out.println(re);
	}
	void rectangle(int w, int h) 
    {
        int re=w*h;
        System.out.println(re);
    }
	void trapezoid(int a, int b, int h) 
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
	void square(int a)
	{
        int re=a*a;
        System.out.println(re);
    }
	void parallelogram(int b, int h) 
	{
        int re=b*h;
        System.out.println(re);
    }
	void sector(int r) 
	{
        double t=30.5;
		double aa=0.5;
        double re=r*r*t;
        System.out.println(re);
    }
	public static void main(String[] args)
	{
		System.out.println("Area of Circle");
		new With_method_with_parameter().circle(4);	
		System.out.println("Area of Triangle");
		new With_method_with_parameter().triangle(4,3);
		System.out.println("Area of Rectangle");
		new With_method_with_parameter().rectangle(6,8);
		System.out.println("Area of Trapezoid");
		new With_method_with_parameter().trapezoid(2,4,6);
		System.out.println("Area of Ellipse");
		new With_method_with_parameter().ellipse(3,9);
		System.out.println("Area of Square");
		new With_method_with_parameter().square(9);
		System.out.println("Area of Parallelogram");
		new With_method_with_parameter().parallelogram(9,15);
		System.out.println("Area of Sector");
		new With_method_with_parameter().sector(5);
	}
}