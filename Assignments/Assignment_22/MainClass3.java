package abstraction;

interface Geometric_Shape
{
	void side();
}
class Triangle implements Geometric_Shape
{
	public void side()
	{
		System.out.println("Triangle");
	}
}
class Rectangle implements Geometric_Shape
{
	public void side()
	{
		System.out.println("Rectangle");
	}
}
class Pentagon implements Geometric_Shape
{
	public void side()
	{
		System.out.println("Pentagon");
	}
}
class Figure
{
	public static void shape(Geometric_Shape s1)
	{
		s1.side();
	}
}
public class MainClass3 {
	public static void main(String[] args) {
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		Pentagon p=new Pentagon();
		Figure.shape(p);
		Figure.shape(r);
		Figure.shape(t);
	}

}
