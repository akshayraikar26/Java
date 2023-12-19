package methodoverriding;

class Whatsapp_v1
{
	void status()
	{
		System.out.println("Status With Text");
	}
}
class Whatsapp_v2 extends Whatsapp_v1
{
	void status()
	{
	System.out.println("Status With Text, Images & Videos");	
	}
}
public class Whatsappupdated 
{
	public static void main(String[] args)
	{
		Whatsapp_v2 v3=new Whatsapp_v2();
				v3.status();
}	

}
