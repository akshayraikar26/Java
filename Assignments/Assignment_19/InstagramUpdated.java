package methodoverriding;

class Instagram_v1
{
	void add()
	{
		System.out.println("Posts");
	}
}
class Instagram_v2 extends Instagram_v1
{
	void add()
	{
		super.add();
		System.out.println("Reels");
	}
}
class Instagram_v3 extends Instagram_v2
{
	void add()
	{
		super.add();
		System.out.println("Note");
	}
}
public class InstagramUpdated 
{
	public static void main(String[] args) 
	{
		Instagram_v3 v4=new Instagram_v3();
		v4.add();
	}

}
