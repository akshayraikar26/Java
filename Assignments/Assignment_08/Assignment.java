class Circle
{
    static double area()
{
       final double pi=3.142;
       int r=6;
       double re=pi*r*r;
       return re;
}
}
class Triangle
{
	static double area()
	{
		double aa=0.5;
		int b=2;
		int h=4;
		double re=aa*b*h;
		return re;
	}
}
class Rectangle
{
	static int area()
	{
		int w=10;
		int h=5;
		int re=w*h;
		return re;
	}
}
class Square
{
	static int area()
	{
		int a=30;
		int re=a*a;
		return re;
	}
}
class Parallelogram
{
	static int area()
	{
		int b=20;
		int h=40;
		int re=b*h;
		return re;
	}
}
class Ellipse
{
	static double area()
	{
		final double pi=3.142;
		int a=3;
		int b=9;
		double re=pi*a*b;
		return re;
	}
}
class Trapezoid
{
	static double area()
	{
		double aa=0.5;
		int a=2;
		int b=4;
		int h=8;
		double re=aa*(a+b)*h;
		return re;
	}
}
class Sector
{
	static double area()
	{
		double aa=0.5;
		double the=36.7;
		int r=6;
		double re=aa*r*r*the;
		return re;
	}
}
class Assignment
{
public static void main(String[] args)
{
	System.out.println("Area of Circle");
    double x=Circle.area();
    System.out.println(x);
	System.out.println("Area of Triangle");
    double y=Triangle.area();
    System.out.println(y);
	System.out.println("Area of Rectangle");
    int z=Rectangle.area();
    System.out.println(z);
	System.out.println("Area of Square");
    int w=Square.area();
    System.out.println(w);
	System.out.println("Area of Parallelogram");
    int v=Parallelogram.area();
    System.out.println(v);
	System.out.println("Area of Ellipse");
    double u=Ellipse.area();
    System.out.println(u);
	System.out.println("Area of Trapezoid");
    double t=Trapezoid.area();
    System.out.println(t);
	System.out.println("Area of Sector");
    double s=Sector.area();
    System.out.println(s);
}
}

