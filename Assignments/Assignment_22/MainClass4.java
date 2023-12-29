package abstraction;

interface Fabric
{
	void variety();
}
class Cotton implements Fabric
{
	public void variety()
	{
		System.out.println("Cotton");
	}
}
class Silk implements Fabric
{
	public void variety()
	{
		System.out.println("Silk");
	}
}
class Velvet implements Fabric
{
	public void variety()
	{
		System.out.println("Velvet");
	}
}
class Textile
{
	public static void cloth(Fabric f1)
	{
		f1.variety();
	}
}
public class MainClass4 {
	public static void main(String[] args) {
		Cotton c=new Cotton();
		Silk s=new Silk();
		Velvet v=new Velvet();
		Textile.cloth(c);
		Textile.cloth(s);
		Textile.cloth(v);
	}
}
