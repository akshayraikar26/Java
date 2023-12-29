package abstraction;

interface Communication
{
	void via();
}
class Kannada implements Communication
{
	public void via()
	{
		System.out.println("Kannada");
	}
}
class English implements Communication
{
	public void via()
	{
		System.out.println("English");
	}
}
class Hindi implements Communication
{
	public void via()
	{
		System.out.println("Hindi");
	}
}
class Language
{
	public static void speak(Communication c1)
	{
		c1.via();
	}
}
public class MainClass1 {
	public static void main(String[] args) {
		Kannada k=new Kannada();
		English e=new English();
		Hindi h=new Hindi();
		Language.speak(k);
		Language.speak(e);
		Language.speak(h);
		
	}

}
