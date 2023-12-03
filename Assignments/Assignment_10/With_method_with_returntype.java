class With_method_with_returntype
{
    double triangle() 
    {
        int b=5;
        int h=7;
        return 0.5*b*h;
    }
    int rectangle() 
	{
        int w =10;
        int h =5;
        return w*h;
    }
    double trapezoid() 
	{
        int a = 10;
        int b = 18;
        int h = 5;
        return 0.5*(a+b)*h;
    }
    double ellipse() 
	{
        int a=5;
        int b=5;
        final double pi=3.142;
        return pi*a*b;
    }
    int square() 
	{
        int a=5;
        return a*a;
    }
    int parallelogram() 
	{
        int b=10;
        int h=5;
        return b*h;
    }
    double circle() 
	{
        int r=5;
        final double pi=3.142;
        return pi*r*r;
    }
    double sector() 
	{
        int r=5;
        double t=30.5;
        return 0.5*r*r*t;
    }
    public static void main(String[] args) 
	{
        System.out.println("Area of Triangle");
        double s=new With_method_with_returntype().triangle();
        System.out.println(s);
        System.out.println("Area of Rectangle");
        int t=new With_method_with_returntype().rectangle();
        System.out.println(t);
        System.out.println("Area of Trapezoid");
        double u=new With_method_with_returntype().trapezoid();
        System.out.println(u);
        System.out.println("Area of Ellipse");
        double v=new With_method_with_returntype().ellipse();
        System.out.println(v);
        System.out.println("Area of Square");
        int w=new With_method_with_returntype().square();
        System.out.println(w);
        System.out.println("Area of Parallelogram");
        int x=new With_method_with_returntype().parallelogram();
        System.out.println(x);
        System.out.println("Area of Circle");
        double y=new With_method_with_returntype().circle();
        System.out.println(y);
        System.out.println("Area of Sector");
        double z=new With_method_with_returntype().sector();
        System.out.println(z);
    }
}