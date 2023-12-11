class Java
{
	void learn()
	{
		System.out.println("Core Java");
	}
}
class Shankarsir
{
	static void teach(Java j2)
	{
		j2.learn();
	}
}
class Students
{
	public static void main(String[] args)
	{
		Java j1=new Java();
		Shankarsir.teach(j1);
	}
}