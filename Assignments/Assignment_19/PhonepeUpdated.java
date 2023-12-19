package methodoverriding;
class Phonepe_v1
{
	void send()
	{
		System.out.println("Pay Via QR Code");
	}
}
class Phonepe_v2 extends Phonepe_v1
{
	void send()
	{
		System.out.println("Pay via UPI");
	}
}
class Phonepe_v3 extends Phonepe_v2
{
	void send()
	{
		System.out.println("Pay via QR Code & UPI");
	}
}
public class PhonepeUpdated 
{
	public static void main(String[] args) 
	{
		Phonepe_v3 v4=new Phonepe_v3();
				v4.send();
	}
	
}

